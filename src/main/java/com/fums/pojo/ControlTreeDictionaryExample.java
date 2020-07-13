package com.fums.pojo;

import java.util.ArrayList;
import java.util.List;

public class ControlTreeDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ControlTreeDictionaryExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andTreeIdIsNull() {
            addCriterion("tree_id is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("tree_id is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(Integer value) {
            addCriterion("tree_id =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(Integer value) {
            addCriterion("tree_id <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(Integer value) {
            addCriterion("tree_id >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tree_id >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(Integer value) {
            addCriterion("tree_id <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("tree_id <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<Integer> values) {
            addCriterion("tree_id in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<Integer> values) {
            addCriterion("tree_id not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("tree_id between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tree_id not between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andInformationIsNull() {
            addCriterion("information is null");
            return (Criteria) this;
        }

        public Criteria andInformationIsNotNull() {
            addCriterion("information is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEqualTo(String value) {
            addCriterion("information =", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotEqualTo(String value) {
            addCriterion("information <>", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThan(String value) {
            addCriterion("information >", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThanOrEqualTo(String value) {
            addCriterion("information >=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThan(String value) {
            addCriterion("information <", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThanOrEqualTo(String value) {
            addCriterion("information <=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLike(String value) {
            addCriterion("information like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotLike(String value) {
            addCriterion("information not like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationIn(List<String> values) {
            addCriterion("information in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotIn(List<String> values) {
            addCriterion("information not in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationBetween(String value1, String value2) {
            addCriterion("information between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotBetween(String value1, String value2) {
            addCriterion("information not between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andSonInformationIsNull() {
            addCriterion("son_information is null");
            return (Criteria) this;
        }

        public Criteria andSonInformationIsNotNull() {
            addCriterion("son_information is not null");
            return (Criteria) this;
        }

        public Criteria andSonInformationEqualTo(String value) {
            addCriterion("son_information =", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationNotEqualTo(String value) {
            addCriterion("son_information <>", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationGreaterThan(String value) {
            addCriterion("son_information >", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationGreaterThanOrEqualTo(String value) {
            addCriterion("son_information >=", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationLessThan(String value) {
            addCriterion("son_information <", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationLessThanOrEqualTo(String value) {
            addCriterion("son_information <=", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationLike(String value) {
            addCriterion("son_information like", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationNotLike(String value) {
            addCriterion("son_information not like", value, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationIn(List<String> values) {
            addCriterion("son_information in", values, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationNotIn(List<String> values) {
            addCriterion("son_information not in", values, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationBetween(String value1, String value2) {
            addCriterion("son_information between", value1, value2, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andSonInformationNotBetween(String value1, String value2) {
            addCriterion("son_information not between", value1, value2, "sonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationIsNull() {
            addCriterion("grandson_information is null");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationIsNotNull() {
            addCriterion("grandson_information is not null");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationEqualTo(String value) {
            addCriterion("grandson_information =", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationNotEqualTo(String value) {
            addCriterion("grandson_information <>", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationGreaterThan(String value) {
            addCriterion("grandson_information >", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationGreaterThanOrEqualTo(String value) {
            addCriterion("grandson_information >=", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationLessThan(String value) {
            addCriterion("grandson_information <", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationLessThanOrEqualTo(String value) {
            addCriterion("grandson_information <=", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationLike(String value) {
            addCriterion("grandson_information like", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationNotLike(String value) {
            addCriterion("grandson_information not like", value, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationIn(List<String> values) {
            addCriterion("grandson_information in", values, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationNotIn(List<String> values) {
            addCriterion("grandson_information not in", values, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationBetween(String value1, String value2) {
            addCriterion("grandson_information between", value1, value2, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andGrandsonInformationNotBetween(String value1, String value2) {
            addCriterion("grandson_information not between", value1, value2, "grandsonInformation");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNull() {
            addCriterion("`fields` is null");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNotNull() {
            addCriterion("`fields` is not null");
            return (Criteria) this;
        }

        public Criteria andFieldsEqualTo(String value) {
            addCriterion("`fields` =", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotEqualTo(String value) {
            addCriterion("`fields` <>", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThan(String value) {
            addCriterion("`fields` >", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("`fields` >=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThan(String value) {
            addCriterion("`fields` <", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThanOrEqualTo(String value) {
            addCriterion("`fields` <=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLike(String value) {
            addCriterion("`fields` like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotLike(String value) {
            addCriterion("`fields` not like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsIn(List<String> values) {
            addCriterion("`fields` in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotIn(List<String> values) {
            addCriterion("`fields` not in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsBetween(String value1, String value2) {
            addCriterion("`fields` between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotBetween(String value1, String value2) {
            addCriterion("`fields` not between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseIsNull() {
            addCriterion("fields_chinaese is null");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseIsNotNull() {
            addCriterion("fields_chinaese is not null");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseEqualTo(String value) {
            addCriterion("fields_chinaese =", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseNotEqualTo(String value) {
            addCriterion("fields_chinaese <>", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseGreaterThan(String value) {
            addCriterion("fields_chinaese >", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseGreaterThanOrEqualTo(String value) {
            addCriterion("fields_chinaese >=", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseLessThan(String value) {
            addCriterion("fields_chinaese <", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseLessThanOrEqualTo(String value) {
            addCriterion("fields_chinaese <=", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseLike(String value) {
            addCriterion("fields_chinaese like", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseNotLike(String value) {
            addCriterion("fields_chinaese not like", value, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseIn(List<String> values) {
            addCriterion("fields_chinaese in", values, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseNotIn(List<String> values) {
            addCriterion("fields_chinaese not in", values, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseBetween(String value1, String value2) {
            addCriterion("fields_chinaese between", value1, value2, "fieldsChinaese");
            return (Criteria) this;
        }

        public Criteria andFieldsChinaeseNotBetween(String value1, String value2) {
            addCriterion("fields_chinaese not between", value1, value2, "fieldsChinaese");
            return (Criteria) this;
        }
    }

    /**
     */
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