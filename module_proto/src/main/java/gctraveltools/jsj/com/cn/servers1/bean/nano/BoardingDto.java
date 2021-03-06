// Generated by the protocol buffer compiler.  DO NOT EDIT!

package gctraveltools.jsj.com.cn.servers1.bean.nano;

@SuppressWarnings("hiding")
public final class BoardingDto extends
    com.google.protobuf.nano.android.ParcelableMessageNano {

  // Used by Parcelable
  @SuppressWarnings({"unused"})
  public static final android.os.Parcelable.Creator<BoardingDto> CREATOR =
      new com.google.protobuf.nano.android.ParcelableMessageNanoCreator<
          BoardingDto>(BoardingDto.class);

  private static volatile BoardingDto[] _emptyArray;
  public static BoardingDto[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new BoardingDto[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional int32 BoardingID = 1 [default = 0];
  public int boardingID;

  // optional int32 AdditionalServicesID = 2 [default = 0];
  public int additionalServicesID;

  // optional string BoardingEncryptParam = 3;
  public java.lang.String boardingEncryptParam;

  // optional string BoardingServiceName = 4;
  public java.lang.String boardingServiceName;

  // optional double SalePrice = 5 [default = 0];
  public double salePrice;

  // optional int32 BoardingType = 6 [default = 0];
  public int boardingType;

  // optional string OwnerEmployeeMobile = 7;
  public java.lang.String ownerEmployeeMobile;

  public BoardingDto() {
    clear();
  }

  public BoardingDto clear() {
    boardingID = 0;
    additionalServicesID = 0;
    boardingEncryptParam = "";
    boardingServiceName = "";
    salePrice = 0D;
    boardingType = 0;
    ownerEmployeeMobile = "";
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (this.boardingID != 0) {
      output.writeInt32(1, this.boardingID);
    }
    if (this.additionalServicesID != 0) {
      output.writeInt32(2, this.additionalServicesID);
    }
    if (!this.boardingEncryptParam.equals("")) {
      output.writeString(3, this.boardingEncryptParam);
    }
    if (!this.boardingServiceName.equals("")) {
      output.writeString(4, this.boardingServiceName);
    }
    if (java.lang.Double.doubleToLongBits(this.salePrice)
        != java.lang.Double.doubleToLongBits(0D)) {
      output.writeDouble(5, this.salePrice);
    }
    if (this.boardingType != 0) {
      output.writeInt32(6, this.boardingType);
    }
    if (!this.ownerEmployeeMobile.equals("")) {
      output.writeString(7, this.ownerEmployeeMobile);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (this.boardingID != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.boardingID);
    }
    if (this.additionalServicesID != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(2, this.additionalServicesID);
    }
    if (!this.boardingEncryptParam.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(3, this.boardingEncryptParam);
    }
    if (!this.boardingServiceName.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(4, this.boardingServiceName);
    }
    if (java.lang.Double.doubleToLongBits(this.salePrice)
        != java.lang.Double.doubleToLongBits(0D)) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeDoubleSize(5, this.salePrice);
    }
    if (this.boardingType != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(6, this.boardingType);
    }
    if (!this.ownerEmployeeMobile.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(7, this.ownerEmployeeMobile);
    }
    return size;
  }

  @Override
  public BoardingDto mergeFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 8: {
          this.boardingID = input.readInt32();
          break;
        }
        case 16: {
          this.additionalServicesID = input.readInt32();
          break;
        }
        case 26: {
          this.boardingEncryptParam = input.readString();
          break;
        }
        case 34: {
          this.boardingServiceName = input.readString();
          break;
        }
        case 41: {
          this.salePrice = input.readDouble();
          break;
        }
        case 48: {
          this.boardingType = input.readInt32();
          break;
        }
        case 58: {
          this.ownerEmployeeMobile = input.readString();
          break;
        }
      }
    }
  }

  public static BoardingDto parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new BoardingDto(), data);
  }

  public static BoardingDto parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new BoardingDto().mergeFrom(input);
  }
}
