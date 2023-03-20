package com.dtstack.flinkx.connector.doris.rest.module;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * StatisticRow
 *
 * @author yangsiting
 * @version 2.0.0
 * @date 2023/3/17 16:44
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticRow {

    @JsonProperty(value = "DbName")
    private String DbName;

    public String getDbName() {
        return DbName;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("DbName", DbName)
                .toString();
    }
}
