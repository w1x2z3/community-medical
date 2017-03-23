package com.xiyou.community.medical.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreviousTreatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreviousTreatExample() {
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

        public Criteria andTheDiseaseIsNull() {
            addCriterion("the_disease is null");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseIsNotNull() {
            addCriterion("the_disease is not null");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseEqualTo(String value) {
            addCriterion("the_disease =", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseNotEqualTo(String value) {
            addCriterion("the_disease <>", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseGreaterThan(String value) {
            addCriterion("the_disease >", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("the_disease >=", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseLessThan(String value) {
            addCriterion("the_disease <", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseLessThanOrEqualTo(String value) {
            addCriterion("the_disease <=", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseLike(String value) {
            addCriterion("the_disease like", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseNotLike(String value) {
            addCriterion("the_disease not like", value, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseIn(List<String> values) {
            addCriterion("the_disease in", values, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseNotIn(List<String> values) {
            addCriterion("the_disease not in", values, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseBetween(String value1, String value2) {
            addCriterion("the_disease between", value1, value2, "theDisease");
            return (Criteria) this;
        }

        public Criteria andTheDiseaseNotBetween(String value1, String value2) {
            addCriterion("the_disease not between", value1, value2, "theDisease");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeIsNull() {
            addCriterion("diagnosis_time is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeIsNotNull() {
            addCriterion("diagnosis_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeEqualTo(Date value) {
            addCriterion("diagnosis_time =", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeNotEqualTo(Date value) {
            addCriterion("diagnosis_time <>", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeGreaterThan(Date value) {
            addCriterion("diagnosis_time >", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("diagnosis_time >=", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeLessThan(Date value) {
            addCriterion("diagnosis_time <", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeLessThanOrEqualTo(Date value) {
            addCriterion("diagnosis_time <=", value, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeIn(List<Date> values) {
            addCriterion("diagnosis_time in", values, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeNotIn(List<Date> values) {
            addCriterion("diagnosis_time not in", values, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeBetween(Date value1, Date value2) {
            addCriterion("diagnosis_time between", value1, value2, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTimeNotBetween(Date value1, Date value2) {
            addCriterion("diagnosis_time not between", value1, value2, "diagnosisTime");
            return (Criteria) this;
        }

        public Criteria andThreatAddressIsNull() {
            addCriterion("threat_address is null");
            return (Criteria) this;
        }

        public Criteria andThreatAddressIsNotNull() {
            addCriterion("threat_address is not null");
            return (Criteria) this;
        }

        public Criteria andThreatAddressEqualTo(String value) {
            addCriterion("threat_address =", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressNotEqualTo(String value) {
            addCriterion("threat_address <>", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressGreaterThan(String value) {
            addCriterion("threat_address >", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressGreaterThanOrEqualTo(String value) {
            addCriterion("threat_address >=", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressLessThan(String value) {
            addCriterion("threat_address <", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressLessThanOrEqualTo(String value) {
            addCriterion("threat_address <=", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressLike(String value) {
            addCriterion("threat_address like", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressNotLike(String value) {
            addCriterion("threat_address not like", value, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressIn(List<String> values) {
            addCriterion("threat_address in", values, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressNotIn(List<String> values) {
            addCriterion("threat_address not in", values, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressBetween(String value1, String value2) {
            addCriterion("threat_address between", value1, value2, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andThreatAddressNotBetween(String value1, String value2) {
            addCriterion("threat_address not between", value1, value2, "threatAddress");
            return (Criteria) this;
        }

        public Criteria andIsCureIsNull() {
            addCriterion("is_cure is null");
            return (Criteria) this;
        }

        public Criteria andIsCureIsNotNull() {
            addCriterion("is_cure is not null");
            return (Criteria) this;
        }

        public Criteria andIsCureEqualTo(Boolean value) {
            addCriterion("is_cure =", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureNotEqualTo(Boolean value) {
            addCriterion("is_cure <>", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureGreaterThan(Boolean value) {
            addCriterion("is_cure >", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cure >=", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureLessThan(Boolean value) {
            addCriterion("is_cure <", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cure <=", value, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureIn(List<Boolean> values) {
            addCriterion("is_cure in", values, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureNotIn(List<Boolean> values) {
            addCriterion("is_cure not in", values, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cure between", value1, value2, "isCure");
            return (Criteria) this;
        }

        public Criteria andIsCureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cure not between", value1, value2, "isCure");
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

        public Criteria andResponsibleDoctorIsNull() {
            addCriterion("responsible_doctor is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorIsNotNull() {
            addCriterion("responsible_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorEqualTo(String value) {
            addCriterion("responsible_doctor =", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorNotEqualTo(String value) {
            addCriterion("responsible_doctor <>", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorGreaterThan(String value) {
            addCriterion("responsible_doctor >", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_doctor >=", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorLessThan(String value) {
            addCriterion("responsible_doctor <", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorLessThanOrEqualTo(String value) {
            addCriterion("responsible_doctor <=", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorLike(String value) {
            addCriterion("responsible_doctor like", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorNotLike(String value) {
            addCriterion("responsible_doctor not like", value, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorIn(List<String> values) {
            addCriterion("responsible_doctor in", values, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorNotIn(List<String> values) {
            addCriterion("responsible_doctor not in", values, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorBetween(String value1, String value2) {
            addCriterion("responsible_doctor between", value1, value2, "responsibleDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibleDoctorNotBetween(String value1, String value2) {
            addCriterion("responsible_doctor not between", value1, value2, "responsibleDoctor");
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