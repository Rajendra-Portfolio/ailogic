
package iamrajendra.github.io.ailogic.calenderview.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appointmentstatus implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("SortOrder")
    @Expose
    private Integer sortOrder;
    @SerializedName("Color")
    @Expose
    private String color;
    @SerializedName("Flag")
    @Expose
    private Integer flag;
    private final static long serialVersionUID = -6050906049100640587L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


}
