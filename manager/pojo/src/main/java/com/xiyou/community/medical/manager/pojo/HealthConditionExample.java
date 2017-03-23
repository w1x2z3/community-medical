package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class HealthConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthConditionExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionIsNull() {
            addCriterion("physical_condition is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionIsNotNull() {
            addCriterion("physical_condition is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionEqualTo(String value) {
            addCriterion("physical_condition =", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotEqualTo(String value) {
            addCriterion("physical_condition <>", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionGreaterThan(String value) {
            addCriterion("physical_condition >", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionGreaterThanOrEqualTo(String value) {
            addCriterion("physical_condition >=", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLessThan(String value) {
            addCriterion("physical_condition <", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLessThanOrEqualTo(String value) {
            addCriterion("physical_condition <=", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLike(String value) {
            addCriterion("physical_condition like", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotLike(String value) {
            addCriterion("physical_condition not like", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionIn(List<String> values) {
            addCriterion("physical_condition in", values, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotIn(List<String> values) {
            addCriterion("physical_condition not in", values, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionBetween(String value1, String value2) {
            addCriterion("physical_condition between", value1, value2, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotBetween(String value1, String value2) {
            addCriterion("physical_condition not between", value1, value2, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNull() {
            addCriterion("blood_pressure is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNotNull() {
            addCriterion("blood_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureEqualTo(Integer value) {
            addCriterion("blood_pressure =", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotEqualTo(Integer value) {
            addCriterion("blood_pressure <>", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThan(Integer value) {
            addCriterion("blood_pressure >", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure >=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThan(Integer value) {
            addCriterion("blood_pressure <", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThanOrEqualTo(Integer value) {
            addCriterion("blood_pressure <=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIn(List<Integer> values) {
            addCriterion("blood_pressure in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotIn(List<Integer> values) {
            addCriterion("blood_pressure not in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_pressure not between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("heart_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("heart_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(String value) {
            addCriterion("heart_rate =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(String value) {
            addCriterion("heart_rate <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(String value) {
            addCriterion("heart_rate >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(String value) {
            addCriterion("heart_rate >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(String value) {
            addCriterion("heart_rate <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(String value) {
            addCriterion("heart_rate <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLike(String value) {
            addCriterion("heart_rate like", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotLike(String value) {
            addCriterion("heart_rate not like", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<String> values) {
            addCriterion("heart_rate in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<String> values) {
            addCriterion("heart_rate not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(String value1, String value2) {
            addCriterion("heart_rate between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(String value1, String value2) {
            addCriterion("heart_rate not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularIsNull() {
            addCriterion("is_cardvascular is null");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularIsNotNull() {
            addCriterion("is_cardvascular is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularEqualTo(Boolean value) {
            addCriterion("is_cardvascular =", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularNotEqualTo(Boolean value) {
            addCriterion("is_cardvascular <>", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularGreaterThan(Boolean value) {
            addCriterion("is_cardvascular >", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cardvascular >=", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularLessThan(Boolean value) {
            addCriterion("is_cardvascular <", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cardvascular <=", value, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularIn(List<Boolean> values) {
            addCriterion("is_cardvascular in", values, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularNotIn(List<Boolean> values) {
            addCriterion("is_cardvascular not in", values, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cardvascular between", value1, value2, "isCardvascular");
            return (Criteria) this;
        }

        public Criteria andIsCardvascularNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cardvascular not between", value1, value2, "isCardvascular");
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