package grpc.type.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class TypeRestDto {
    private Long id;

    private String typeVarchar;

    private String typeChar;
    
    private String typeText;

    private Integer typeInteger;

    private Integer typeTinyint;

    private Integer typeSmallint;

    private Integer typeMediumint;

    private Long typeBigint;

    private Float typeFloat;

    private Double typeDouble;

    private BigDecimal typeDecimal;

    private Date typeDate;

    private Timestamp typeDatetime;

    private Time typeTime;

    private Timestamp typeTimestamp;

    private byte[] typeBlob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeVarchar() {
		return typeVarchar;
	}

	public void setTypeVarchar(String typeVarchar) {
		this.typeVarchar = typeVarchar;
	}

	public String getTypeChar() {
		return typeChar;
	}

	public void setTypeChar(String typeChar) {
		this.typeChar = typeChar;
	}

	public String getTypeText() {
		return typeText;
	}

	public void setTypeText(String typeText) {
		this.typeText = typeText;
	}

	public Integer getTypeInteger() {
		return typeInteger;
	}

	public void setTypeInteger(Integer typeInteger) {
		this.typeInteger = typeInteger;
	}

	public Integer getTypeTinyint() {
		return typeTinyint;
	}

	public void setTypeTinyint(Integer typeTinyint) {
		this.typeTinyint = typeTinyint;
	}

	public Integer getTypeSmallint() {
		return typeSmallint;
	}

	public void setTypeSmallint(Integer typeSmallint) {
		this.typeSmallint = typeSmallint;
	}

	public Integer getTypeMediumint() {
		return typeMediumint;
	}

	public void setTypeMediumint(Integer typeMediumint) {
		this.typeMediumint = typeMediumint;
	}

	public Long getTypeBigint() {
		return typeBigint;
	}

	public void setTypeBigint(Long typeBigint) {
		this.typeBigint = typeBigint;
	}

	public Float getTypeFloat() {
		return typeFloat;
	}

	public void setTypeFloat(Float typeFloat) {
		this.typeFloat = typeFloat;
	}

	public Double getTypeDouble() {
		return typeDouble;
	}

	public void setTypeDouble(Double typeDouble) {
		this.typeDouble = typeDouble;
	}

	public BigDecimal getTypeDecimal() {
		return typeDecimal;
	}

	public void setTypeDecimal(BigDecimal typeDecimal) {
		this.typeDecimal = typeDecimal;
	}

	public Date getTypeDate() {
		return typeDate;
	}

	public void setTypeDate(Date typeDate) {
		this.typeDate = typeDate;
	}

	public Timestamp getTypeDatetime() {
		return typeDatetime;
	}

	public void setTypeDatetime(Timestamp typeDatetime) {
		this.typeDatetime = typeDatetime;
	}

	public Time getTypeTime() {
		return typeTime;
	}

	public void setTypeTime(Time typeTime) {
		this.typeTime = typeTime;
	}

	public Timestamp getTypeTimestamp() {
		return typeTimestamp;
	}

	public void setTypeTimestamp(Timestamp typeTimestamp) {
		this.typeTimestamp = typeTimestamp;
	}

	public byte[] getTypeBlob() {
		return typeBlob;
	}

	public void setTypeBlob(byte[] typeBlob) {
		this.typeBlob = typeBlob;
	}


}