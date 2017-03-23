package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class DruginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DruginfoExample() {
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

        public Criteria andDosageDescriptionIsNull() {
            addCriterion("dosage_description is null");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionIsNotNull() {
            addCriterion("dosage_description is not null");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionEqualTo(String value) {
            addCriterion("dosage_description =", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionNotEqualTo(String value) {
            addCriterion("dosage_description <>", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionGreaterThan(String value) {
            addCriterion("dosage_description >", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("dosage_description >=", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionLessThan(String value) {
            addCriterion("dosage_description <", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("dosage_description <=", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionLike(String value) {
            addCriterion("dosage_description like", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionNotLike(String value) {
            addCriterion("dosage_description not like", value, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionIn(List<String> values) {
            addCriterion("dosage_description in", values, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionNotIn(List<String> values) {
            addCriterion("dosage_description not in", values, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionBetween(String value1, String value2) {
            addCriterion("dosage_description between", value1, value2, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andDosageDescriptionNotBetween(String value1, String value2) {
            addCriterion("dosage_description not between", value1, value2, "dosageDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionIsNull() {
            addCriterion("taboo_description is null");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionIsNotNull() {
            addCriterion("taboo_description is not null");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionEqualTo(String value) {
            addCriterion("taboo_description =", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionNotEqualTo(String value) {
            addCriterion("taboo_description <>", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionGreaterThan(String value) {
            addCriterion("taboo_description >", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("taboo_description >=", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionLessThan(String value) {
            addCriterion("taboo_description <", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionLessThanOrEqualTo(String value) {
            addCriterion("taboo_description <=", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionLike(String value) {
            addCriterion("taboo_description like", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionNotLike(String value) {
            addCriterion("taboo_description not like", value, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionIn(List<String> values) {
            addCriterion("taboo_description in", values, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionNotIn(List<String> values) {
            addCriterion("taboo_description not in", values, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionBetween(String value1, String value2) {
            addCriterion("taboo_description between", value1, value2, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andTabooDescriptionNotBetween(String value1, String value2) {
            addCriterion("taboo_description not between", value1, value2, "tabooDescription");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNull() {
            addCriterion("drug_price is null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIsNotNull() {
            addCriterion("drug_price is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPriceEqualTo(Long value) {
            addCriterion("drug_price =", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotEqualTo(Long value) {
            addCriterion("drug_price <>", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThan(Long value) {
            addCriterion("drug_price >", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("drug_price >=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThan(Long value) {
            addCriterion("drug_price <", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceLessThanOrEqualTo(Long value) {
            addCriterion("drug_price <=", value, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceIn(List<Long> values) {
            addCriterion("drug_price in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotIn(List<Long> values) {
            addCriterion("drug_price not in", values, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceBetween(Long value1, Long value2) {
            addCriterion("drug_price between", value1, value2, "drugPrice");
            return (Criteria) this;
        }

        public Criteria andDrugPriceNotBetween(Long value1, Long value2) {
            addCriterion("drug_price not between", value1, value2, "drugPrice");
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