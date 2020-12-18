package grpc.type.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;

import grpc.type.dao.TypeDao;
import grpc.type.dto.TypeDto;
import grpc.type.proto.ReplyType;
import grpc.type.proto.ReplyTypeWrapper;
import grpc.type.proto.RequestId;
import grpc.type.proto.TypeGrpc.TypeImplBase;
import grpc.type.utils.CopyPropertiesUtils;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TypeServer extends TypeImplBase {
	@Autowired
	TypeDao typeDao;

	@Override
	public void getTypeById(RequestId request, StreamObserver<ReplyType> responseObserver) {
		// TODO Auto-generated method stub

		TypeDto type = typeDao.getTypeById(request.getId());
		grpc.type.proto.ReplyType.Builder builder = ReplyType.newBuilder();
		CopyPropertiesUtils.copyPropertiesIgnoreNull(type, builder);
		if (type.getTypeBlob() != null) {
			builder.setTypeBlob(ByteString.copyFrom(type.getTypeBlob()));
		}
		ReplyType replyType = builder.build();
		responseObserver.onNext(replyType);
		responseObserver.onCompleted();
	}

	@Override
	public void getTypeWrapperById(grpc.type.proto.RequestId request,StreamObserver<ReplyTypeWrapper> responseObserver) {
		// TODO Auto-generated method stub

		TypeDto type = typeDao.getTypeById(request.getId());
		grpc.type.proto.ReplyTypeWrapper.Builder builder = ReplyTypeWrapper.newBuilder();
		if (type.getId() != null) {
			builder.setId(Int64Value.of(type.getId()));
		}
		if (type.getTypeVarchar() != null) {
			builder.setTypeVarchar(StringValue.of(type.getTypeVarchar()));
		}
		if (type.getTypeChar() != null) {
			builder.setTypeChar(StringValue.of(type.getTypeChar()));
		}
		if (type.getTypeText() != null) {
			builder.setTypeText(StringValue.of(type.getTypeText()));
		}
		if (type.getTypeInteger() != null) {
			builder.setTypeInteger(Int32Value.of(type.getTypeInteger()));
		}
		if (type.getTypeInteger() != null) {
			builder.setTypeInteger(Int32Value.of(type.getTypeInteger()));
		}
		if (type.getTypeTinyint() != null) {
			builder.setTypeTinyint(Int32Value.of(type.getTypeTinyint()));
		}
		if (type.getTypeSmallint() != null) {
			builder.setTypeSmallint(Int32Value.of(type.getTypeSmallint()));
		}
		if (type.getTypeMediumint() != null) {
			builder.setTypeMediumint(Int32Value.of(type.getTypeMediumint()));
		}
		if (type.getTypeBigint() != null) {
			builder.setTypeBigint(Int64Value.of(type.getTypeBigint()));
		}
		if (type.getTypeFloat() != null) {
			builder.setTypeFloat(FloatValue.of(type.getTypeFloat()));
		}
		if (type.getTypeDouble() != null) {
			builder.setTypeDouble(DoubleValue.of(type.getTypeDouble()));
		}
		if (type.getTypeDecimal() != null) {
			builder.setTypeDecimal(StringValue.of(type.getTypeDecimal()));
		}
		if (type.getTypeDate() != null) {
			builder.setTypeDate(StringValue.of(type.getTypeDate()));
		}
		if (type.getTypeDatetime() != null) {
			builder.setTypeDatetime(StringValue.of(type.getTypeDatetime()));
		}
		if (type.getTypeTime() != null) {
			builder.setTypeTime(StringValue.of(type.getTypeTime()));
		}
		if (type.getTypeTimestamp() != null) {
			builder.setTypeTimestamp(StringValue.of(type.getTypeTimestamp()));
		}
		if (type.getTypeBlob() != null) {
			builder.setTypeBlob(BytesValue.of(ByteString.copyFrom(type.getTypeBlob())));
		}
		ReplyTypeWrapper replyTypeWrapper = builder.build();
		responseObserver.onNext(replyTypeWrapper);
		responseObserver.onCompleted();
	}
}
