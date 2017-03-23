package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class LifestyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LifestyleExample() {
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

        public Criteria andDrinkConditionIsNull() {
            addCriterion("drink_condition is null");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionIsNotNull() {
            addCriterion("drink_condition is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionEqualTo(String value) {
            addCriterion("drink_condition =", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionNotEqualTo(String value) {
            addCriterion("drink_condition <>", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionGreaterThan(String value) {
            addCriterion("drink_condition >", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionGreaterThanOrEqualTo(String value) {
            addCriterion("drink_condition >=", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionLessThan(String value) {
            addCriterion("drink_condition <", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionLessThanOrEqualTo(String value) {
            addCriterion("drink_condition <=", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionLike(String value) {
            addCriterion("drink_condition like", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionNotLike(String value) {
            addCriterion("drink_condition not like", value, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionIn(List<String> values) {
            addCriterion("drink_condition in", values, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionNotIn(List<String> values) {
            addCriterion("drink_condition not in", values, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionBetween(String value1, String value2) {
            addCriterion("drink_condition between", value1, value2, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andDrinkConditionNotBetween(String value1, String value2) {
            addCriterion("drink_condition not between", value1, value2, "drinkCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionIsNull() {
            addCriterion("smoking_condition is null");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionIsNotNull() {
            addCriterion("smoking_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionEqualTo(String value) {
            addCriterion("smoking_condition =", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionNotEqualTo(String value) {
            addCriterion("smoking_condition <>", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionGreaterThan(String value) {
            addCriterion("smoking_condition >", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("smoking_condition >=", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionLessThan(String value) {
            addCriterion("smoking_condition <", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionLessThanOrEqualTo(String value) {
            addCriterion("smoking_condition <=", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionLike(String value) {
            addCriterion("smoking_condition like", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionNotLike(String value) {
            addCriterion("smoking_condition not like", value, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionIn(List<String> values) {
            addCriterion("smoking_condition in", values, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionNotIn(List<String> values) {
            addCriterion("smoking_condition not in", values, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionBetween(String value1, String value2) {
            addCriterion("smoking_condition between", value1, value2, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andSmokingConditionNotBetween(String value1, String value2) {
            addCriterion("smoking_condition not between", value1, value2, "smokingCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionIsNull() {
            addCriterion("blood_pressure_condition is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionIsNotNull() {
            addCriterion("blood_pressure_condition is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionEqualTo(String value) {
            addCriterion("blood_pressure_condition =", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionNotEqualTo(String value) {
            addCriterion("blood_pressure_condition <>", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionGreaterThan(String value) {
            addCriterion("blood_pressure_condition >", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionGreaterThanOrEqualTo(String value) {
            addCriterion("blood_pressure_condition >=", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionLessThan(String value) {
            addCriterion("blood_pressure_condition <", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionLessThanOrEqualTo(String value) {
            addCriterion("blood_pressure_condition <=", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionLike(String value) {
            addCriterion("blood_pressure_condition like", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionNotLike(String value) {
            addCriterion("blood_pressure_condition not like", value, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionIn(List<String> values) {
            addCriterion("blood_pressure_condition in", values, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionNotIn(List<String> values) {
            addCriterion("blood_pressure_condition not in", values, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionBetween(String value1, String value2) {
            addCriterion("blood_pressure_condition between", value1, value2, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andBloodPressureConditionNotBetween(String value1, String value2) {
            addCriterion("blood_pressure_condition not between", value1, value2, "bloodPressureCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionIsNull() {
            addCriterion("exercise_condition is null");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionIsNotNull() {
            addCriterion("exercise_condition is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionEqualTo(String value) {
            addCriterion("exercise_condition =", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionNotEqualTo(String value) {
            addCriterion("exercise_condition <>", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionGreaterThan(String value) {
            addCriterion("exercise_condition >", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_condition >=", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionLessThan(String value) {
            addCriterion("exercise_condition <", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionLessThanOrEqualTo(String value) {
            addCriterion("exercise_condition <=", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionLike(String value) {
            addCriterion("exercise_condition like", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionNotLike(String value) {
            addCriterion("exercise_condition not like", value, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionIn(List<String> values) {
            addCriterion("exercise_condition in", values, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionNotIn(List<String> values) {
            addCriterion("exercise_condition not in", values, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionBetween(String value1, String value2) {
            addCriterion("exercise_condition between", value1, value2, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andExerciseConditionNotBetween(String value1, String value2) {
            addCriterion("exercise_condition not between", value1, value2, "exerciseCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionIsNull() {
            addCriterion("meals_condition is null");
            return (Criteria) this;
        }

        public Criteria andMealsConditionIsNotNull() {
            addCriterion("meals_condition is not null");
            return (Criteria) this;
        }

        public Criteria andMealsConditionEqualTo(String value) {
            addCriterion("meals_condition =", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionNotEqualTo(String value) {
            addCriterion("meals_condition <>", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionGreaterThan(String value) {
            addCriterion("meals_condition >", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionGreaterThanOrEqualTo(String value) {
            addCriterion("meals_condition >=", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionLessThan(String value) {
            addCriterion("meals_condition <", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionLessThanOrEqualTo(String value) {
            addCriterion("meals_condition <=", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionLike(String value) {
            addCriterion("meals_condition like", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionNotLike(String value) {
            addCriterion("meals_condition not like", value, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionIn(List<String> values) {
            addCriterion("meals_condition in", values, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionNotIn(List<String> values) {
            addCriterion("meals_condition not in", values, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionBetween(String value1, String value2) {
            addCriterion("meals_condition between", value1, value2, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andMealsConditionNotBetween(String value1, String value2) {
            addCriterion("meals_condition not between", value1, value2, "mealsCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionIsNull() {
            addCriterion("sleep_condition is null");
            return (Criteria) this;
        }

        public Criteria andSleepConditionIsNotNull() {
            addCriterion("sleep_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSleepConditionEqualTo(String value) {
            addCriterion("sleep_condition =", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionNotEqualTo(String value) {
            addCriterion("sleep_condition <>", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionGreaterThan(String value) {
            addCriterion("sleep_condition >", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionGreaterThanOrEqualTo(String value) {
            addCriterion("sleep_condition >=", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionLessThan(String value) {
            addCriterion("sleep_condition <", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionLessThanOrEqualTo(String value) {
            addCriterion("sleep_condition <=", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionLike(String value) {
            addCriterion("sleep_condition like", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionNotLike(String value) {
            addCriterion("sleep_condition not like", value, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionIn(List<String> values) {
            addCriterion("sleep_condition in", values, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionNotIn(List<String> values) {
            addCriterion("sleep_condition not in", values, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionBetween(String value1, String value2) {
            addCriterion("sleep_condition between", value1, value2, "sleepCondition");
            return (Criteria) this;
        }

        public Criteria andSleepConditionNotBetween(String value1, String value2) {
            addCriterion("sleep_condition not between", value1, value2, "sleepCondition");
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