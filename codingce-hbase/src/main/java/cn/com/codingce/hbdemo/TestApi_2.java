package cn.com.codingce.hbdemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.NamespaceDescriptor;
import org.apache.hadoop.hbase.NamespaceNotFoundException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestApi_2 {

    public static void main(String[] args) throws IOException {

//        dropTable("codingce:student");
        createTable("user", "info");
    }

    //获取 Configuration 对象
    public static Configuration conf;

    static {
        //使用 HBaseConfiguration 的单例方法实例化
        conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "139.9.34.48");
        conf.set("hbase.zookeeper.property.clientPort", "2181");

    }

    /**
     * 获取连接
     *
     * @return
     * @throws IOException
     */
    public static Connection getConnection() throws IOException {
        Connection connection = ConnectionFactory.createConnection(conf);
        System.out.println("创建连接。。。" + connection);
        return connection;
    }

    /**
     * 判断表是否存在
     *
     * @param tableName
     * @return
     * @throws MasterNotRunningException
     * @throws ZooKeeperConnectionException
     * @throws IOException
     */
    public static boolean isTableExist(String tableName) throws MasterNotRunningException,
            ZooKeeperConnectionException, IOException {
        //在 HBase 中管理、访问表需要先创建 HBaseAdmin 对象
        //Connection connection = ConnectionFactory.createConnection(conf);
        // HBaseAdmin admin = (HBaseAdmin) connection.getAdmin();
        Connection connection = getConnection();
        Admin admin = connection.getAdmin();
        boolean result = admin.tableExists(TableName.valueOf(tableName));
        System.out.println("表是否存在：" + result);
        return result;
    }

    /**
     * 创建表
     *
     * @param tableName
     * @param columnFamily
     * @throws MasterNotRunningException
     * @throws ZooKeeperConnectionException
     * @throws IOException
     */
    public static void createTable(String tableName, String... columnFamily) throws
            MasterNotRunningException, ZooKeeperConnectionException, IOException {

        Connection connection = getConnection();

        Admin admin = connection.getAdmin();

        //操作数据库 判断数据库中有没有某张表
        //判断命名空间
        try {
            admin.getNamespaceDescriptor("codingce");
        } catch (NamespaceNotFoundException e) {
            //创建命名空间
            NamespaceDescriptor codingce = NamespaceDescriptor.create("codingce").build();
            admin.createNamespace(codingce);
        }

        //判断表是否存在
        if (isTableExist("codingce:" + tableName)) {
            System.out.println("表 " + "codingce:" + tableName + "已存在");
            //System.exit(0);
        } else {
            //创建表
            //创建表属性对象,表名需要转字节
            HTableDescriptor descriptor = new HTableDescriptor(TableName.valueOf("codingce:" + tableName));
            //创建多个列族
            for (String cf : columnFamily) {
                descriptor.addFamily(new HColumnDescriptor(cf));
            }
            //根据对表的配置，创建表
            admin.createTable(descriptor);

            System.out.println("表 " + "codingce:" + tableName + "创建成功!");
        }
    }

    /**
     * 删除表
     * <p>
     * codingce:student
     * 命名空间 : 表名
     *
     * @param tableName
     * @throws MasterNotRunningException
     * @throws ZooKeeperConnectionException
     * @throws IOException
     */
    public static void dropTable(String tableName) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
        Connection connection = getConnection();
        Admin admin = connection.getAdmin();
        if (isTableExist(tableName)) {
            admin.disableTable(TableName.valueOf(tableName));
            admin.deleteTable(TableName.valueOf(tableName));
            System.out.println("表" + tableName + "删除成功!");
        } else {
            System.out.println("表" + tableName + "不存在!");
        }
    }

    /**
     * 向表中插入数据
     *
     * @param tableName
     * @param rowKey
     * @param columnFamily
     * @param column
     * @param value
     * @throws IOException
     */
    public static void addRowData(String tableName,
                                  String rowKey,
                                  String columnFamily,
                                  String column,
                                  String value) throws IOException {
        Connection connection = getConnection();

        //查询数据
        //获取指定表对象
        Table table = connection.getTable(TableName.valueOf(tableName));
        //注意字符编码问题
        //Get get = new Get(rowkey.getBytes());
        Get get = new Get(Bytes.toBytes(rowKey));

        //查询结果
        Result result = table.get(get);
        boolean empty = result.isEmpty();

        System.out.println("是否存在：" + empty);

        if (empty) {
            //新增数据
            Put put = new Put(Bytes.toBytes(rowKey));
            put.addColumn(Bytes.toBytes(columnFamily), Bytes.toBytes(column), Bytes.toBytes(value));
            table.put(put);
            System.out.println("插入数据成功。。。");
        } else {
            System.out.println("已存在此数据。。。");
        }
    }

    /**
     * 删除多行数据
     *
     * @param tableName
     * @param rows
     * @throws IOException
     */
    public static void deleteMultiRow(String tableName, String... rows) throws IOException {
        HTable hTable = new HTable(conf, tableName);
        List<Delete> deleteList = new ArrayList<Delete>();
        for (String row : rows) {
            Delete delete = new Delete(Bytes.toBytes(row));
            deleteList.add(delete);
        }
        hTable.delete(deleteList);
        hTable.close();
    }

    //获取所有数据
    public static void getAllRows(String tableName) throws IOException {
        HTable hTable = new HTable(conf, tableName);
        //得到用于扫描 region 的对象
        Scan scan = new Scan();
        //使用 HTable 得到 resultcanner 实现类的对象
        ResultScanner resultScanner = hTable.getScanner(scan);
        for (Result result : resultScanner) {
            Cell[] cells = result.rawCells();
            for (Cell cell : cells) {
                //上下两个循环待改
                System.out.println(" value " + Bytes.toString(CellUtil.cloneValue(cell)));
                System.out.println(" rowkey " + Bytes.toString(CellUtil.cloneRow(cell)));
                System.out.println(" family " + Bytes.toString(CellUtil.cloneFamily(cell)));
                System.out.println(" column " + Bytes.toString(CellUtil.cloneQualifier(cell)));
            }
        }
    }

    //获取某一行数据
    public static void getRow(String tableName, String rowKey) throws IOException {
        HTable table = new HTable(conf, tableName);
        Get get = new Get(Bytes.toBytes(rowKey));
        //get.setMaxVersions();显示所有版本
        //get.setTimeStamp();显示指定时间戳的版本
        Result result = table.get(get);
        for (Cell cell : result.rawCells()) {
            System.out.println(" value " + Bytes.toString(CellUtil.cloneValue(cell)));
            System.out.println(" rowkey " + Bytes.toString(CellUtil.cloneRow(cell)));
            System.out.println(" family " + Bytes.toString(CellUtil.cloneFamily(cell)));
            System.out.println(" column " + Bytes.toString(CellUtil.cloneQualifier(cell)));
        }
    }
}
