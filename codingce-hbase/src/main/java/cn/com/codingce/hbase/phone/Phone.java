// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone.proto

package cn.com.codingce.hbase.phone;

public final class Phone {
    private Phone() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface PhoneDetailOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required string dnum = 1;

        /**
         * <code>required string dnum = 1;</code>
         */
        boolean hasDnum();

        /**
         * <code>required string dnum = 1;</code>
         */
        String getDnum();

        /**
         * <code>required string dnum = 1;</code>
         */
        com.google.protobuf.ByteString
        getDnumBytes();

        // required string length = 2;

        /**
         * <code>required string length = 2;</code>
         */
        boolean hasLength();

        /**
         * <code>required string length = 2;</code>
         */
        String getLength();

        /**
         * <code>required string length = 2;</code>
         */
        com.google.protobuf.ByteString
        getLengthBytes();

        // required string type = 3;

        /**
         * <code>required string type = 3;</code>
         */
        boolean hasType();

        /**
         * <code>required string type = 3;</code>
         */
        String getType();

        /**
         * <code>required string type = 3;</code>
         */
        com.google.protobuf.ByteString
        getTypeBytes();

        // required string date = 4;

        /**
         * <code>required string date = 4;</code>
         */
        boolean hasDate();

        /**
         * <code>required string date = 4;</code>
         */
        String getDate();

        /**
         * <code>required string date = 4;</code>
         */
        com.google.protobuf.ByteString
        getDateBytes();
    }

    /**
     * Protobuf type {@code cn.ibm.hbase02.PhoneDetail}
     */
    public static final class PhoneDetail extends
            com.google.protobuf.GeneratedMessage
            implements PhoneDetailOrBuilder {
        // Use PhoneDetail.newBuilder() to construct.
        private PhoneDetail(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private PhoneDetail(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final PhoneDetail defaultInstance;

        public static PhoneDetail getDefaultInstance() {
            return defaultInstance;
        }

        public PhoneDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private PhoneDetail(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            dnum_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            length_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            type_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            date_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Phone.internal_static_cn_ibm_hbase02_PhoneDetail_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Phone.internal_static_cn_ibm_hbase02_PhoneDetail_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            PhoneDetail.class, Builder.class);
        }

        public static com.google.protobuf.Parser<PhoneDetail> PARSER =
                new com.google.protobuf.AbstractParser<PhoneDetail>() {
                    public PhoneDetail parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PhoneDetail(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<PhoneDetail> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required string dnum = 1;
        public static final int DNUM_FIELD_NUMBER = 1;
        private Object dnum_;

        /**
         * <code>required string dnum = 1;</code>
         */
        public boolean hasDnum() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string dnum = 1;</code>
         */
        public String getDnum() {
            Object ref = dnum_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    dnum_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string dnum = 1;</code>
         */
        public com.google.protobuf.ByteString
        getDnumBytes() {
            Object ref = dnum_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                dnum_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string length = 2;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private Object length_;

        /**
         * <code>required string length = 2;</code>
         */
        public boolean hasLength() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required string length = 2;</code>
         */
        public String getLength() {
            Object ref = length_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    length_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string length = 2;</code>
         */
        @Override
        public com.google.protobuf.ByteString
        getLengthBytes() {
            Object ref = length_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                length_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string type = 3;
        public static final int TYPE_FIELD_NUMBER = 3;
        private Object type_;

        /**
         * <code>required string type = 3;</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>required string type = 3;</code>
         */
        public String getType() {
            Object ref = type_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    type_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string type = 3;</code>
         */
        public com.google.protobuf.ByteString
        getTypeBytes() {
            Object ref = type_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                type_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string date = 4;
        public static final int DATE_FIELD_NUMBER = 4;
        private Object date_;

        /**
         * <code>required string date = 4;</code>
         */
        public boolean hasDate() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>required string date = 4;</code>
         */
        public String getDate() {
            Object ref = date_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    date_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string date = 4;</code>
         */
        public com.google.protobuf.ByteString
        getDateBytes() {
            Object ref = date_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                date_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            dnum_ = "";
            length_ = "";
            type_ = "";
            date_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasDnum()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLength()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDate()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getDnumBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getLengthBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getTypeBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getDateBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getDnumBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getLengthBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getTypeBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getDateBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static PhoneDetail parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PhoneDetail parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PhoneDetail parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PhoneDetail parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PhoneDetail parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static PhoneDetail parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static PhoneDetail parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static PhoneDetail parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static PhoneDetail parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static PhoneDetail parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(PhoneDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code cn.ibm.hbase02.PhoneDetail}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements PhoneDetailOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Phone.internal_static_cn_ibm_hbase02_PhoneDetail_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Phone.internal_static_cn_ibm_hbase02_PhoneDetail_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                PhoneDetail.class, Builder.class);
            }

            // Construct using cn.ibm.hbase02.Phone.PhoneDetail.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                dnum_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                length_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                type_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                date_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Phone.internal_static_cn_ibm_hbase02_PhoneDetail_descriptor;
            }

            public PhoneDetail getDefaultInstanceForType() {
                return PhoneDetail.getDefaultInstance();
            }

            public PhoneDetail build() {
                PhoneDetail result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public PhoneDetail buildPartial() {
                PhoneDetail result = new PhoneDetail(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.dnum_ = dnum_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.length_ = length_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.date_ = date_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof PhoneDetail) {
                    return mergeFrom((PhoneDetail) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(PhoneDetail other) {
                if (other == PhoneDetail.getDefaultInstance()) return this;
                if (other.hasDnum()) {
                    bitField0_ |= 0x00000001;
                    dnum_ = other.dnum_;
                    onChanged();
                }
                if (other.hasLength()) {
                    bitField0_ |= 0x00000002;
                    length_ = other.length_;
                    onChanged();
                }
                if (other.hasType()) {
                    bitField0_ |= 0x00000004;
                    type_ = other.type_;
                    onChanged();
                }
                if (other.hasDate()) {
                    bitField0_ |= 0x00000008;
                    date_ = other.date_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasDnum()) {

                    return false;
                }
                if (!hasLength()) {

                    return false;
                }
                if (!hasType()) {

                    return false;
                }
                if (!hasDate()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                PhoneDetail parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (PhoneDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // required string dnum = 1;
            private Object dnum_ = "";

            /**
             * <code>required string dnum = 1;</code>
             */
            public boolean hasDnum() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required string dnum = 1;</code>
             */
            public String getDnum() {
                Object ref = dnum_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    dnum_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string dnum = 1;</code>
             */
            public com.google.protobuf.ByteString
            getDnumBytes() {
                Object ref = dnum_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    dnum_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string dnum = 1;</code>
             */
            public Builder setDnum(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                dnum_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string dnum = 1;</code>
             */
            public Builder clearDnum() {
                bitField0_ = (bitField0_ & ~0x00000001);
                dnum_ = getDefaultInstance().getDnum();
                onChanged();
                return this;
            }

            /**
             * <code>required string dnum = 1;</code>
             */
            public Builder setDnumBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                dnum_ = value;
                onChanged();
                return this;
            }

            // required string length = 2;
            private Object length_ = "";

            /**
             * <code>required string length = 2;</code>
             */
            public boolean hasLength() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required string length = 2;</code>
             */
            public String getLength() {
                Object ref = length_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    length_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string length = 2;</code>
             */
            @Override
            public com.google.protobuf.ByteString
            getLengthBytes() {
                Object ref = length_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    length_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string length = 2;</code>
             */
            public Builder setLength(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                length_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string length = 2;</code>
             */
            public Builder clearLength() {
                bitField0_ = (bitField0_ & ~0x00000002);
                length_ = getDefaultInstance().getLength();
                onChanged();
                return this;
            }

            /**
             * <code>required string length = 2;</code>
             */
            public Builder setLengthBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                length_ = value;
                onChanged();
                return this;
            }

            // required string type = 3;
            private Object type_ = "";

            /**
             * <code>required string type = 3;</code>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>required string type = 3;</code>
             */
            public String getType() {
                Object ref = type_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    type_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string type = 3;</code>
             */
            public com.google.protobuf.ByteString
            getTypeBytes() {
                Object ref = type_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    type_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string type = 3;</code>
             */
            public Builder setType(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string type = 3;</code>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000004);
                type_ = getDefaultInstance().getType();
                onChanged();
                return this;
            }

            /**
             * <code>required string type = 3;</code>
             */
            public Builder setTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
                return this;
            }

            // required string date = 4;
            private Object date_ = "";

            /**
             * <code>required string date = 4;</code>
             */
            public boolean hasDate() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>required string date = 4;</code>
             */
            public String getDate() {
                Object ref = date_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    date_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string date = 4;</code>
             */
            public com.google.protobuf.ByteString
            getDateBytes() {
                Object ref = date_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    date_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string date = 4;</code>
             */
            public Builder setDate(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                date_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string date = 4;</code>
             */
            public Builder clearDate() {
                bitField0_ = (bitField0_ & ~0x00000008);
                date_ = getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            /**
             * <code>required string date = 4;</code>
             */
            public Builder setDateBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                date_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:cn.ibm.hbase02.PhoneDetail)
        }

        static {
            defaultInstance = new PhoneDetail(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:cn.ibm.hbase02.PhoneDetail)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_cn_ibm_hbase02_PhoneDetail_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_cn_ibm_hbase02_PhoneDetail_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\013phone.proto\022\016cn.ibm.hbase02\"G\n\013PhoneDe" +
                        "tail\022\014\n\004dnum\030\001 \002(\t\022\016\n\006length\030\002 \002(\t\022\014\n\004ty" +
                        "pe\030\003 \002(\t\022\014\n\004date\030\004 \002(\t"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_cn_ibm_hbase02_PhoneDetail_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_cn_ibm_hbase02_PhoneDetail_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_cn_ibm_hbase02_PhoneDetail_descriptor,
                                new String[]{"Dnum", "Length", "Type", "Date",});
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
