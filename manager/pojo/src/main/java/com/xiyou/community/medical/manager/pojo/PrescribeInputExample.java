package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrescribeInputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescribeInputExample() {
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

        public Criteria andPatienNameIsNull() {
            addCriterion("patien_name is null");
            return (Criteria) this;
        }

        public Criteria andPatienNameIsNotNull() {
            addCriterion("patien_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatienNameEqualTo(String value) {
            addCriterion("patien_name =", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameNotEqualTo(String value) {
            addCriterion("patien_name <>", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameGreaterThan(String value) {
            addCriterion("patien_name >", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameGreaterThanOrEqualTo(String value) {
            addCriterion("patien_name >=", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameLessThan(String value) {
            addCriterion("patien_name <", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameLessThanOrEqualTo(String value) {
            addCriterion("patien_name <=", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameLike(String value) {
            addCriterion("patien_name like", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameNotLike(String value) {
            addCriterion("patien_name not like", value, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameIn(List<String> values) {
            addCriterion("patien_name in", values, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameNotIn(List<String> values) {
            addCriterion("patien_name not in", values, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameBetween(String value1, String value2) {
            addCriterion("patien_name between", value1, value2, "patienName");
            return (Criteria) this;
        }

        public Criteria andPatienNameNotBetween(String value1, String value2) {
            addCriterion("patien_name not between", value1, value2, "patienName");
            return (Criteria) this;
        }

        public Criteria andIsInfusionIsNull() {
            addCriterion("is_infusion is null");
            return (Criteria) this;
        }

        public Criteria andIsInfusionIsNotNull() {
            addCriterion("is_infusion is not null");
            return (Criteria) this;
        }

        public Criteria andIsInfusionEqualTo(Boolean value) {
            addCriterion("is_infusion =", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionNotEqualTo(Boolean value) {
            addCriterion("is_infusion <>", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionGreaterThan(Boolean value) {
            addCriterion("is_infusion >", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_infusion >=", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionLessThan(Boolean value) {
            addCriterion("is_infusion <", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_infusion <=", value, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionIn(List<Boolean> values) {
            addCriterion("is_infusion in", values, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionNotIn(List<Boolean> values) {
            addCriterion("is_infusion not in", values, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_infusion between", value1, value2, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andIsInfusionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_infusion not between", value1, value2, "isInfusion");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseIsNull() {
            addCriterion("diagnosis_disease is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseIsNotNull() {
            addCriterion("diagnosis_disease is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseEqualTo(String value) {
            addCriterion("diagnosis_disease =", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseNotEqualTo(String value) {
            addCriterion("diagnosis_disease <>", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseGreaterThan(String value) {
            addCriterion("diagnosis_disease >", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_disease >=", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseLessThan(String value) {
            addCriterion("diagnosis_disease <", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_disease <=", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseLike(String value) {
            addCriterion("diagnosis_disease like", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseNotLike(String value) {
            addCriterion("diagnosis_disease not like", value, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseIn(List<String> values) {
            addCriterion("diagnosis_disease in", values, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseNotIn(List<String> values) {
            addCriterion("diagnosis_disease not in", values, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseBetween(String value1, String value2) {
            addCriterion("diagnosis_disease between", value1, value2, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDiseaseNotBetween(String value1, String value2) {
            addCriterion("diagnosis_disease not between", value1, value2, "diagnosisDisease");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("drug_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("drug_name =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("drug_name <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("drug_name >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_name >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("drug_name <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("drug_name <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("drug_name like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("drug_name not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("drug_name in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("drug_name not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("drug_name between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("drug_name not between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIsNull() {
            addCriterion("drug_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIsNotNull() {
            addCriterion("drug_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberEqualTo(String value) {
            addCriterion("drug_number =", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotEqualTo(String value) {
            addCriterion("drug_number <>", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThan(String value) {
            addCriterion("drug_number >", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drug_number >=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThan(String value) {
            addCriterion("drug_number <", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThanOrEqualTo(String value) {
            addCriterion("drug_number <=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLike(String value) {
            addCriterion("drug_number like", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotLike(String value) {
            addCriterion("drug_number not like", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIn(List<String> values) {
            addCriterion("drug_number in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotIn(List<String> values) {
            addCriterion("drug_number not in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberBetween(String value1, String value2) {
            addCriterion("drug_number between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotBetween(String value1, String value2) {
            addCriterion("drug_number not between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Long value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Long value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Long value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Long value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Long value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Long value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Long> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Long> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Long value1, Long value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Long value1, Long value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
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