/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.DashboardQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ScatterViewProperties
 */

public class ScatterViewProperties extends ViewProperties {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SCATTER("scatter");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.SCATTER;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<DashboardQuery> queries = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLORS = "colors";
  @SerializedName(SERIALIZED_NAME_COLORS)
  private List<String> colors = new ArrayList<>();

  /**
   * Gets or Sets shape
   */
  @JsonAdapter(ShapeEnum.Adapter.class)
  public enum ShapeEnum {
    CHRONOGRAF_V2("chronograf-v2");

    private String value;

    ShapeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShapeEnum fromValue(String text) {
      for (ShapeEnum b : ShapeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShapeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShapeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShapeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShapeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SHAPE = "shape";
  @SerializedName(SERIALIZED_NAME_SHAPE)
  private ShapeEnum shape = ShapeEnum.CHRONOGRAF_V2;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SHOW_NOTE_WHEN_EMPTY = "showNoteWhenEmpty";
  @SerializedName(SERIALIZED_NAME_SHOW_NOTE_WHEN_EMPTY)
  private Boolean showNoteWhenEmpty;

  public static final String SERIALIZED_NAME_X_COLUMN = "xColumn";
  @SerializedName(SERIALIZED_NAME_X_COLUMN)
  private String xColumn;

  public static final String SERIALIZED_NAME_Y_COLUMN = "yColumn";
  @SerializedName(SERIALIZED_NAME_Y_COLUMN)
  private String yColumn;

  public static final String SERIALIZED_NAME_FILL_COLUMNS = "fillColumns";
  @SerializedName(SERIALIZED_NAME_FILL_COLUMNS)
  private List<String> fillColumns = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYMBOL_COLUMNS = "symbolColumns";
  @SerializedName(SERIALIZED_NAME_SYMBOL_COLUMNS)
  private List<String> symbolColumns = new ArrayList<>();

  public static final String SERIALIZED_NAME_X_DOMAIN = "xDomain";
  @SerializedName(SERIALIZED_NAME_X_DOMAIN)
  private List<BigDecimal> xDomain = new ArrayList<>();

  public static final String SERIALIZED_NAME_Y_DOMAIN = "yDomain";
  @SerializedName(SERIALIZED_NAME_Y_DOMAIN)
  private List<BigDecimal> yDomain = new ArrayList<>();

  public static final String SERIALIZED_NAME_X_AXIS_LABEL = "xAxisLabel";
  @SerializedName(SERIALIZED_NAME_X_AXIS_LABEL)
  private String xAxisLabel;

  public static final String SERIALIZED_NAME_Y_AXIS_LABEL = "yAxisLabel";
  @SerializedName(SERIALIZED_NAME_Y_AXIS_LABEL)
  private String yAxisLabel;

  public static final String SERIALIZED_NAME_X_PREFIX = "xPrefix";
  @SerializedName(SERIALIZED_NAME_X_PREFIX)
  private String xPrefix;

  public static final String SERIALIZED_NAME_X_SUFFIX = "xSuffix";
  @SerializedName(SERIALIZED_NAME_X_SUFFIX)
  private String xSuffix;

  public static final String SERIALIZED_NAME_Y_PREFIX = "yPrefix";
  @SerializedName(SERIALIZED_NAME_Y_PREFIX)
  private String yPrefix;

  public static final String SERIALIZED_NAME_Y_SUFFIX = "ySuffix";
  @SerializedName(SERIALIZED_NAME_Y_SUFFIX)
  private String ySuffix;

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public ScatterViewProperties queries(List<DashboardQuery> queries) {
    this.queries = queries;
    return this;
  }

  public ScatterViewProperties addQueriesItem(DashboardQuery queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DashboardQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<DashboardQuery> queries) {
    this.queries = queries;
  }

  public ScatterViewProperties colors(List<String> colors) {
    this.colors = colors;
    return this;
  }

  public ScatterViewProperties addColorsItem(String colorsItem) {
    this.colors.add(colorsItem);
    return this;
  }

   /**
   * Colors define color encoding of data into a visualization
   * @return colors
  **/
  @ApiModelProperty(required = true, value = "Colors define color encoding of data into a visualization")
  public List<String> getColors() {
    return colors;
  }

  public void setColors(List<String> colors) {
    this.colors = colors;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(required = true, value = "")
  public ShapeEnum getShape() {
    return shape;
  }

  public ScatterViewProperties note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ScatterViewProperties showNoteWhenEmpty(Boolean showNoteWhenEmpty) {
    this.showNoteWhenEmpty = showNoteWhenEmpty;
    return this;
  }

   /**
   * if true, will display note when empty
   * @return showNoteWhenEmpty
  **/
  @ApiModelProperty(required = true, value = "if true, will display note when empty")
  public Boolean getShowNoteWhenEmpty() {
    return showNoteWhenEmpty;
  }

  public void setShowNoteWhenEmpty(Boolean showNoteWhenEmpty) {
    this.showNoteWhenEmpty = showNoteWhenEmpty;
  }

  public ScatterViewProperties xColumn(String xColumn) {
    this.xColumn = xColumn;
    return this;
  }

   /**
   * Get xColumn
   * @return xColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getXColumn() {
    return xColumn;
  }

  public void setXColumn(String xColumn) {
    this.xColumn = xColumn;
  }

  public ScatterViewProperties yColumn(String yColumn) {
    this.yColumn = yColumn;
    return this;
  }

   /**
   * Get yColumn
   * @return yColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getYColumn() {
    return yColumn;
  }

  public void setYColumn(String yColumn) {
    this.yColumn = yColumn;
  }

  public ScatterViewProperties fillColumns(List<String> fillColumns) {
    this.fillColumns = fillColumns;
    return this;
  }

  public ScatterViewProperties addFillColumnsItem(String fillColumnsItem) {
    this.fillColumns.add(fillColumnsItem);
    return this;
  }

   /**
   * Get fillColumns
   * @return fillColumns
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getFillColumns() {
    return fillColumns;
  }

  public void setFillColumns(List<String> fillColumns) {
    this.fillColumns = fillColumns;
  }

  public ScatterViewProperties symbolColumns(List<String> symbolColumns) {
    this.symbolColumns = symbolColumns;
    return this;
  }

  public ScatterViewProperties addSymbolColumnsItem(String symbolColumnsItem) {
    this.symbolColumns.add(symbolColumnsItem);
    return this;
  }

   /**
   * Get symbolColumns
   * @return symbolColumns
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getSymbolColumns() {
    return symbolColumns;
  }

  public void setSymbolColumns(List<String> symbolColumns) {
    this.symbolColumns = symbolColumns;
  }

  public ScatterViewProperties xDomain(List<BigDecimal> xDomain) {
    this.xDomain = xDomain;
    return this;
  }

  public ScatterViewProperties addXDomainItem(BigDecimal xDomainItem) {
    this.xDomain.add(xDomainItem);
    return this;
  }

   /**
   * Get xDomain
   * @return xDomain
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BigDecimal> getXDomain() {
    return xDomain;
  }

  public void setXDomain(List<BigDecimal> xDomain) {
    this.xDomain = xDomain;
  }

  public ScatterViewProperties yDomain(List<BigDecimal> yDomain) {
    this.yDomain = yDomain;
    return this;
  }

  public ScatterViewProperties addYDomainItem(BigDecimal yDomainItem) {
    this.yDomain.add(yDomainItem);
    return this;
  }

   /**
   * Get yDomain
   * @return yDomain
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BigDecimal> getYDomain() {
    return yDomain;
  }

  public void setYDomain(List<BigDecimal> yDomain) {
    this.yDomain = yDomain;
  }

  public ScatterViewProperties xAxisLabel(String xAxisLabel) {
    this.xAxisLabel = xAxisLabel;
    return this;
  }

   /**
   * Get xAxisLabel
   * @return xAxisLabel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getXAxisLabel() {
    return xAxisLabel;
  }

  public void setXAxisLabel(String xAxisLabel) {
    this.xAxisLabel = xAxisLabel;
  }

  public ScatterViewProperties yAxisLabel(String yAxisLabel) {
    this.yAxisLabel = yAxisLabel;
    return this;
  }

   /**
   * Get yAxisLabel
   * @return yAxisLabel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getYAxisLabel() {
    return yAxisLabel;
  }

  public void setYAxisLabel(String yAxisLabel) {
    this.yAxisLabel = yAxisLabel;
  }

  public ScatterViewProperties xPrefix(String xPrefix) {
    this.xPrefix = xPrefix;
    return this;
  }

   /**
   * Get xPrefix
   * @return xPrefix
  **/
  @ApiModelProperty(required = true, value = "")
  public String getXPrefix() {
    return xPrefix;
  }

  public void setXPrefix(String xPrefix) {
    this.xPrefix = xPrefix;
  }

  public ScatterViewProperties xSuffix(String xSuffix) {
    this.xSuffix = xSuffix;
    return this;
  }

   /**
   * Get xSuffix
   * @return xSuffix
  **/
  @ApiModelProperty(required = true, value = "")
  public String getXSuffix() {
    return xSuffix;
  }

  public void setXSuffix(String xSuffix) {
    this.xSuffix = xSuffix;
  }

  public ScatterViewProperties yPrefix(String yPrefix) {
    this.yPrefix = yPrefix;
    return this;
  }

   /**
   * Get yPrefix
   * @return yPrefix
  **/
  @ApiModelProperty(required = true, value = "")
  public String getYPrefix() {
    return yPrefix;
  }

  public void setYPrefix(String yPrefix) {
    this.yPrefix = yPrefix;
  }

  public ScatterViewProperties ySuffix(String ySuffix) {
    this.ySuffix = ySuffix;
    return this;
  }

   /**
   * Get ySuffix
   * @return ySuffix
  **/
  @ApiModelProperty(required = true, value = "")
  public String getYSuffix() {
    return ySuffix;
  }

  public void setYSuffix(String ySuffix) {
    this.ySuffix = ySuffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterViewProperties scatterViewProperties = (ScatterViewProperties) o;
    return Objects.equals(this.type, scatterViewProperties.type) &&
        Objects.equals(this.queries, scatterViewProperties.queries) &&
        Objects.equals(this.colors, scatterViewProperties.colors) &&
        Objects.equals(this.shape, scatterViewProperties.shape) &&
        Objects.equals(this.note, scatterViewProperties.note) &&
        Objects.equals(this.showNoteWhenEmpty, scatterViewProperties.showNoteWhenEmpty) &&
        Objects.equals(this.xColumn, scatterViewProperties.xColumn) &&
        Objects.equals(this.yColumn, scatterViewProperties.yColumn) &&
        Objects.equals(this.fillColumns, scatterViewProperties.fillColumns) &&
        Objects.equals(this.symbolColumns, scatterViewProperties.symbolColumns) &&
        Objects.equals(this.xDomain, scatterViewProperties.xDomain) &&
        Objects.equals(this.yDomain, scatterViewProperties.yDomain) &&
        Objects.equals(this.xAxisLabel, scatterViewProperties.xAxisLabel) &&
        Objects.equals(this.yAxisLabel, scatterViewProperties.yAxisLabel) &&
        Objects.equals(this.xPrefix, scatterViewProperties.xPrefix) &&
        Objects.equals(this.xSuffix, scatterViewProperties.xSuffix) &&
        Objects.equals(this.yPrefix, scatterViewProperties.yPrefix) &&
        Objects.equals(this.ySuffix, scatterViewProperties.ySuffix) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, queries, colors, shape, note, showNoteWhenEmpty, xColumn, yColumn, fillColumns, symbolColumns, xDomain, yDomain, xAxisLabel, yAxisLabel, xPrefix, xSuffix, yPrefix, ySuffix, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterViewProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    showNoteWhenEmpty: ").append(toIndentedString(showNoteWhenEmpty)).append("\n");
    sb.append("    xColumn: ").append(toIndentedString(xColumn)).append("\n");
    sb.append("    yColumn: ").append(toIndentedString(yColumn)).append("\n");
    sb.append("    fillColumns: ").append(toIndentedString(fillColumns)).append("\n");
    sb.append("    symbolColumns: ").append(toIndentedString(symbolColumns)).append("\n");
    sb.append("    xDomain: ").append(toIndentedString(xDomain)).append("\n");
    sb.append("    yDomain: ").append(toIndentedString(yDomain)).append("\n");
    sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
    sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
    sb.append("    xPrefix: ").append(toIndentedString(xPrefix)).append("\n");
    sb.append("    xSuffix: ").append(toIndentedString(xSuffix)).append("\n");
    sb.append("    yPrefix: ").append(toIndentedString(yPrefix)).append("\n");
    sb.append("    ySuffix: ").append(toIndentedString(ySuffix)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
