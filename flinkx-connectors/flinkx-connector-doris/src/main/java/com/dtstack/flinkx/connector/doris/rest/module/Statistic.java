package com.dtstack.flinkx.connector.doris.rest.module;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Statistic
 *
 * @author yangsiting
 * @version 2.0.0
 * @date 2023/3/17 16:42
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Statistic {

    @JsonProperty(value = "rows")
    private List<StatisticRow> rows;

    public List<StatisticRow> getRows() {
        return rows;
    }

    public void setRows(List<StatisticRow> rows) {
        this.rows = rows;
    }
}
