// Generated by the protocol buffer compiler.  DO NOT EDIT!

package gctraveltools.jsj.com.cn.servers1.bean.nano;

@SuppressWarnings("hiding")
public final class GetTravels2Request extends
    com.google.protobuf.nano.android.ParcelableMessageNano {

  // Used by Parcelable
  @SuppressWarnings({"unused"})
  public static final android.os.Parcelable.Creator<GetTravels2Request> CREATOR =
      new com.google.protobuf.nano.android.ParcelableMessageNanoCreator<
          GetTravels2Request>(GetTravels2Request.class);

  private static volatile GetTravels2Request[] _emptyArray;
  public static GetTravels2Request[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new GetTravels2Request[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional .BaseRequest BaseRequest = 1;
  public gctraveltools.jsj.com.cn.servers1.bean.nano.BaseRequest baseRequest;

  // optional int32 JSJID = 2 [default = 0];
  public int jSJID;

  // optional int32 PageIndex = 3 [default = 0];
  public int pageIndex;

  // optional int32 PageSize = 4 [default = 0];
  public int pageSize;

  // optional bool IsshowFlightDynamic = 5 [default = false];
  public boolean isshowFlightDynamic;

  // optional .TravelRouteType TravelRouteType = 6 [default = TravelRouteTypeUnSetting];
  public int travelRouteType;

  // repeated .TravelType TravelTypes = 7;
  public int[] travelTypes;

  public GetTravels2Request() {
    clear();
  }

  public GetTravels2Request clear() {
    baseRequest = new gctraveltools.jsj.com.cn.servers1.bean.nano.BaseRequest();
    jSJID = 0;
    pageIndex = 0;
    pageSize = 0;
    isshowFlightDynamic = false;
    travelRouteType = gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeUnSetting;
    travelTypes = com.google.protobuf.nano.WireFormatNano.EMPTY_INT_ARRAY;
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (this.baseRequest != null) {
      output.writeMessage(1, this.baseRequest);
    }
    if (this.jSJID != 0) {
      output.writeInt32(2, this.jSJID);
    }
    if (this.pageIndex != 0) {
      output.writeInt32(3, this.pageIndex);
    }
    if (this.pageSize != 0) {
      output.writeInt32(4, this.pageSize);
    }
    if (this.isshowFlightDynamic != false) {
      output.writeBool(5, this.isshowFlightDynamic);
    }
    if (this.travelRouteType != gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeUnSetting) {
      output.writeInt32(6, this.travelRouteType);
    }
    if (this.travelTypes != null && this.travelTypes.length > 0) {
      for (int i = 0; i < this.travelTypes.length; i++) {
        output.writeInt32(7, this.travelTypes[i]);
      }
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (this.baseRequest != null) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeMessageSize(1, this.baseRequest);
    }
    if (this.jSJID != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(2, this.jSJID);
    }
    if (this.pageIndex != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(3, this.pageIndex);
    }
    if (this.pageSize != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(4, this.pageSize);
    }
    if (this.isshowFlightDynamic != false) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(5, this.isshowFlightDynamic);
    }
    if (this.travelRouteType != gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeUnSetting) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeInt32Size(6, this.travelRouteType);
    }
    if (this.travelTypes != null && this.travelTypes.length > 0) {
      int dataSize = 0;
      for (int i = 0; i < this.travelTypes.length; i++) {
        int element = this.travelTypes[i];
        dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32SizeNoTag(element);
      }
      size += dataSize;
      size += 1 * this.travelTypes.length;
    }
    return size;
  }

  @Override
  public GetTravels2Request mergeFrom(
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
        case 10: {
          if (this.baseRequest == null) {
            this.baseRequest = new gctraveltools.jsj.com.cn.servers1.bean.nano.BaseRequest();
          }
          input.readMessage(this.baseRequest);
          break;
        }
        case 16: {
          this.jSJID = input.readInt32();
          break;
        }
        case 24: {
          this.pageIndex = input.readInt32();
          break;
        }
        case 32: {
          this.pageSize = input.readInt32();
          break;
        }
        case 40: {
          this.isshowFlightDynamic = input.readBool();
          break;
        }
        case 48: {
          int value = input.readInt32();
          switch (value) {
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeUnSetting:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeSys:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelRouteType.TravelRouteTypeCus:
              this.travelRouteType = value;
              break;
          }
          break;
        }
        case 56: {
          int length = com.google.protobuf.nano.WireFormatNano
              .getRepeatedFieldArrayLength(input, 56);
          int[] validValues = new int[length];
          int validCount = 0;
          for (int i = 0; i < length; i++) {
            if (i != 0) { // tag for first value already consumed.
              input.readTag();
            }
            int value = input.readInt32();
            switch (value) {
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.AirportTravel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.RailportTravel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipHall:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Boarding:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipChannel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VVipHall:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Assistant:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.CombinedOrder:
                validValues[validCount++] = value;
                break;
            }
          }
          if (validCount != 0) {
            int i = this.travelTypes == null ? 0 : this.travelTypes.length;
            if (i == 0 && validCount == validValues.length) {
              this.travelTypes = validValues;
            } else {
              int[] newArray = new int[i + validCount];
              if (i != 0) {
                java.lang.System.arraycopy(this.travelTypes, 0, newArray, 0, i);
              }
              java.lang.System.arraycopy(validValues, 0, newArray, i, validCount);
              this.travelTypes = newArray;
            }
          }
          break;
        }
        case 58: {
          int bytes = input.readRawVarint32();
          int limit = input.pushLimit(bytes);
          // First pass to compute array length.
          int arrayLength = 0;
          int startPos = input.getPosition();
          while (input.getBytesUntilLimit() > 0) {
            switch (input.readInt32()) {
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.AirportTravel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.RailportTravel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipHall:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Boarding:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipChannel:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VVipHall:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Assistant:
              case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.CombinedOrder:
                arrayLength++;
                break;
            }
          }
          if (arrayLength != 0) {
            input.rewindToPosition(startPos);
            int i = this.travelTypes == null ? 0 : this.travelTypes.length;
            int[] newArray = new int[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.travelTypes, 0, newArray, 0, i);
            }
            while (input.getBytesUntilLimit() > 0) {
              int value = input.readInt32();
              switch (value) {
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.AirportTravel:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.RailportTravel:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipHall:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Boarding:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipChannel:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VVipHall:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Assistant:
                case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.CombinedOrder:
                  newArray[i++] = value;
                  break;
              }
            }
            this.travelTypes = newArray;
          }
          input.popLimit(limit);
          break;
        }
      }
    }
  }

  public static GetTravels2Request parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new GetTravels2Request(), data);
  }

  public static GetTravels2Request parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new GetTravels2Request().mergeFrom(input);
  }
}
