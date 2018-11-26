package com.alphonse.accountmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("log_name is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("log_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("log_name =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("log_name <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("log_name >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("log_name >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("log_name <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("log_name <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("log_name like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("log_name not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("log_name in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("log_name not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("log_name between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("log_name not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIsNull() {
            addCriterion("log_username is null");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIsNotNull() {
            addCriterion("log_username is not null");
            return (Criteria) this;
        }

        public Criteria andLogUsernameEqualTo(String value) {
            addCriterion("log_username =", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotEqualTo(String value) {
            addCriterion("log_username <>", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameGreaterThan(String value) {
            addCriterion("log_username >", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("log_username >=", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLessThan(String value) {
            addCriterion("log_username <", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLessThanOrEqualTo(String value) {
            addCriterion("log_username <=", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameLike(String value) {
            addCriterion("log_username like", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotLike(String value) {
            addCriterion("log_username not like", value, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameIn(List<String> values) {
            addCriterion("log_username in", values, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotIn(List<String> values) {
            addCriterion("log_username not in", values, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameBetween(String value1, String value2) {
            addCriterion("log_username between", value1, value2, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogUsernameNotBetween(String value1, String value2) {
            addCriterion("log_username not between", value1, value2, "logUsername");
            return (Criteria) this;
        }

        public Criteria andLogClassIsNull() {
            addCriterion("log_class is null");
            return (Criteria) this;
        }

        public Criteria andLogClassIsNotNull() {
            addCriterion("log_class is not null");
            return (Criteria) this;
        }

        public Criteria andLogClassEqualTo(String value) {
            addCriterion("log_class =", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassNotEqualTo(String value) {
            addCriterion("log_class <>", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassGreaterThan(String value) {
            addCriterion("log_class >", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassGreaterThanOrEqualTo(String value) {
            addCriterion("log_class >=", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassLessThan(String value) {
            addCriterion("log_class <", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassLessThanOrEqualTo(String value) {
            addCriterion("log_class <=", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassLike(String value) {
            addCriterion("log_class like", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassNotLike(String value) {
            addCriterion("log_class not like", value, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassIn(List<String> values) {
            addCriterion("log_class in", values, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassNotIn(List<String> values) {
            addCriterion("log_class not in", values, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassBetween(String value1, String value2) {
            addCriterion("log_class between", value1, value2, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogClassNotBetween(String value1, String value2) {
            addCriterion("log_class not between", value1, value2, "logClass");
            return (Criteria) this;
        }

        public Criteria andLogMothodIsNull() {
            addCriterion("log_mothod is null");
            return (Criteria) this;
        }

        public Criteria andLogMothodIsNotNull() {
            addCriterion("log_mothod is not null");
            return (Criteria) this;
        }

        public Criteria andLogMothodEqualTo(String value) {
            addCriterion("log_mothod =", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodNotEqualTo(String value) {
            addCriterion("log_mothod <>", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodGreaterThan(String value) {
            addCriterion("log_mothod >", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodGreaterThanOrEqualTo(String value) {
            addCriterion("log_mothod >=", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodLessThan(String value) {
            addCriterion("log_mothod <", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodLessThanOrEqualTo(String value) {
            addCriterion("log_mothod <=", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodLike(String value) {
            addCriterion("log_mothod like", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodNotLike(String value) {
            addCriterion("log_mothod not like", value, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodIn(List<String> values) {
            addCriterion("log_mothod in", values, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodNotIn(List<String> values) {
            addCriterion("log_mothod not in", values, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodBetween(String value1, String value2) {
            addCriterion("log_mothod between", value1, value2, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogMothodNotBetween(String value1, String value2) {
            addCriterion("log_mothod not between", value1, value2, "logMothod");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeIsNull() {
            addCriterion("log_createtime is null");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeIsNotNull() {
            addCriterion("log_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeEqualTo(Date value) {
            addCriterion("log_createtime =", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeNotEqualTo(Date value) {
            addCriterion("log_createtime <>", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeGreaterThan(Date value) {
            addCriterion("log_createtime >", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_createtime >=", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeLessThan(Date value) {
            addCriterion("log_createtime <", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("log_createtime <=", value, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeIn(List<Date> values) {
            addCriterion("log_createtime in", values, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeNotIn(List<Date> values) {
            addCriterion("log_createtime not in", values, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeBetween(Date value1, Date value2) {
            addCriterion("log_createtime between", value1, value2, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("log_createtime not between", value1, value2, "logCreatetime");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNull() {
            addCriterion("log_level is null");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNotNull() {
            addCriterion("log_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogLevelEqualTo(String value) {
            addCriterion("log_level =", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotEqualTo(String value) {
            addCriterion("log_level <>", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThan(String value) {
            addCriterion("log_level >", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThanOrEqualTo(String value) {
            addCriterion("log_level >=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThan(String value) {
            addCriterion("log_level <", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThanOrEqualTo(String value) {
            addCriterion("log_level <=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLike(String value) {
            addCriterion("log_level like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotLike(String value) {
            addCriterion("log_level not like", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelIn(List<String> values) {
            addCriterion("log_level in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotIn(List<String> values) {
            addCriterion("log_level not in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelBetween(String value1, String value2) {
            addCriterion("log_level between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotBetween(String value1, String value2) {
            addCriterion("log_level not between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNull() {
            addCriterion("log_msg is null");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNotNull() {
            addCriterion("log_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLogMsgEqualTo(String value) {
            addCriterion("log_msg =", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotEqualTo(String value) {
            addCriterion("log_msg <>", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThan(String value) {
            addCriterion("log_msg >", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThanOrEqualTo(String value) {
            addCriterion("log_msg >=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThan(String value) {
            addCriterion("log_msg <", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThanOrEqualTo(String value) {
            addCriterion("log_msg <=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLike(String value) {
            addCriterion("log_msg like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotLike(String value) {
            addCriterion("log_msg not like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgIn(List<String> values) {
            addCriterion("log_msg in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotIn(List<String> values) {
            addCriterion("log_msg not in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgBetween(String value1, String value2) {
            addCriterion("log_msg between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotBetween(String value1, String value2) {
            addCriterion("log_msg not between", value1, value2, "logMsg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}