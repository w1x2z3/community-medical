package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttentioninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentioninfoExample() {
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

        public Criteria andTheAllergyIsNull() {
            addCriterion("the_allergy is null");
            return (Criteria) this;
        }

        public Criteria andTheAllergyIsNotNull() {
            addCriterion("the_allergy is not null");
            return (Criteria) this;
        }

        public Criteria andTheAllergyEqualTo(String value) {
            addCriterion("the_allergy =", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyNotEqualTo(String value) {
            addCriterion("the_allergy <>", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyGreaterThan(String value) {
            addCriterion("the_allergy >", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyGreaterThanOrEqualTo(String value) {
            addCriterion("the_allergy >=", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyLessThan(String value) {
            addCriterion("the_allergy <", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyLessThanOrEqualTo(String value) {
            addCriterion("the_allergy <=", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyLike(String value) {
            addCriterion("the_allergy like", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyNotLike(String value) {
            addCriterion("the_allergy not like", value, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyIn(List<String> values) {
            addCriterion("the_allergy in", values, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyNotIn(List<String> values) {
            addCriterion("the_allergy not in", values, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyBetween(String value1, String value2) {
            addCriterion("the_allergy between", value1, value2, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andTheAllergyNotBetween(String value1, String value2) {
            addCriterion("the_allergy not between", value1, value2, "theAllergy");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIsNull() {
            addCriterion("disease_history is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIsNotNull() {
            addCriterion("disease_history is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryEqualTo(String value) {
            addCriterion("disease_history =", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotEqualTo(String value) {
            addCriterion("disease_history <>", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryGreaterThan(String value) {
            addCriterion("disease_history >", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("disease_history >=", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLessThan(String value) {
            addCriterion("disease_history <", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLessThanOrEqualTo(String value) {
            addCriterion("disease_history <=", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryLike(String value) {
            addCriterion("disease_history like", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotLike(String value) {
            addCriterion("disease_history not like", value, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryIn(List<String> values) {
            addCriterion("disease_history in", values, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotIn(List<String> values) {
            addCriterion("disease_history not in", values, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryBetween(String value1, String value2) {
            addCriterion("disease_history between", value1, value2, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseHistoryNotBetween(String value1, String value2) {
            addCriterion("disease_history not between", value1, value2, "diseaseHistory");
            return (Criteria) this;
        }

        public Criteria andPresentSituationIsNull() {
            addCriterion("present_situation is null");
            return (Criteria) this;
        }

        public Criteria andPresentSituationIsNotNull() {
            addCriterion("present_situation is not null");
            return (Criteria) this;
        }

        public Criteria andPresentSituationEqualTo(String value) {
            addCriterion("present_situation =", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationNotEqualTo(String value) {
            addCriterion("present_situation <>", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationGreaterThan(String value) {
            addCriterion("present_situation >", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationGreaterThanOrEqualTo(String value) {
            addCriterion("present_situation >=", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationLessThan(String value) {
            addCriterion("present_situation <", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationLessThanOrEqualTo(String value) {
            addCriterion("present_situation <=", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationLike(String value) {
            addCriterion("present_situation like", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationNotLike(String value) {
            addCriterion("present_situation not like", value, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationIn(List<String> values) {
            addCriterion("present_situation in", values, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationNotIn(List<String> values) {
            addCriterion("present_situation not in", values, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationBetween(String value1, String value2) {
            addCriterion("present_situation between", value1, value2, "presentSituation");
            return (Criteria) this;
        }

        public Criteria andPresentSituationNotBetween(String value1, String value2) {
            addCriterion("present_situation not between", value1, value2, "presentSituation");
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