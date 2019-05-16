package com.focus.framework.mybatis.config.handlers;

import com.focus.entity.enums.common.StatusEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusEnumHandler extends BaseTypeHandler<StatusEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, StatusEnum statusEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, statusEnum.getType());
    }

    @Override
    public StatusEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return StatusEnum.from(resultSet.getInt(s));
    }

    @Override
    public StatusEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return StatusEnum.from(resultSet.getInt(i));
    }

    @Override
    public StatusEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return StatusEnum.from(callableStatement.getInt(i));
    }
}
