package com.fums.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PatientExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueIsNull() {
            addCriterion("patient_unique is null");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueIsNotNull() {
            addCriterion("patient_unique is not null");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueEqualTo(String value) {
            addCriterion("patient_unique =", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueNotEqualTo(String value) {
            addCriterion("patient_unique <>", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueGreaterThan(String value) {
            addCriterion("patient_unique >", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("patient_unique >=", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueLessThan(String value) {
            addCriterion("patient_unique <", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueLessThanOrEqualTo(String value) {
            addCriterion("patient_unique <=", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueLike(String value) {
            addCriterion("patient_unique like", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueNotLike(String value) {
            addCriterion("patient_unique not like", value, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueIn(List<String> values) {
            addCriterion("patient_unique in", values, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueNotIn(List<String> values) {
            addCriterion("patient_unique not in", values, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueBetween(String value1, String value2) {
            addCriterion("patient_unique between", value1, value2, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andPatientUniqueNotBetween(String value1, String value2) {
            addCriterion("patient_unique not between", value1, value2, "patientUnique");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBornAdressIsNull() {
            addCriterion("born_adress is null");
            return (Criteria) this;
        }

        public Criteria andBornAdressIsNotNull() {
            addCriterion("born_adress is not null");
            return (Criteria) this;
        }

        public Criteria andBornAdressEqualTo(String value) {
            addCriterion("born_adress =", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressNotEqualTo(String value) {
            addCriterion("born_adress <>", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressGreaterThan(String value) {
            addCriterion("born_adress >", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressGreaterThanOrEqualTo(String value) {
            addCriterion("born_adress >=", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressLessThan(String value) {
            addCriterion("born_adress <", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressLessThanOrEqualTo(String value) {
            addCriterion("born_adress <=", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressLike(String value) {
            addCriterion("born_adress like", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressNotLike(String value) {
            addCriterion("born_adress not like", value, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressIn(List<String> values) {
            addCriterion("born_adress in", values, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressNotIn(List<String> values) {
            addCriterion("born_adress not in", values, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressBetween(String value1, String value2) {
            addCriterion("born_adress between", value1, value2, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornAdressNotBetween(String value1, String value2) {
            addCriterion("born_adress not between", value1, value2, "bornAdress");
            return (Criteria) this;
        }

        public Criteria andBornIsNull() {
            addCriterion("born is null");
            return (Criteria) this;
        }

        public Criteria andBornIsNotNull() {
            addCriterion("born is not null");
            return (Criteria) this;
        }

        public Criteria andBornEqualTo(Date value) {
            addCriterionForJDBCDate("born =", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotEqualTo(Date value) {
            addCriterionForJDBCDate("born <>", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornGreaterThan(Date value) {
            addCriterionForJDBCDate("born >", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("born >=", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornLessThan(Date value) {
            addCriterionForJDBCDate("born <", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("born <=", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornIn(List<Date> values) {
            addCriterionForJDBCDate("born in", values, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotIn(List<Date> values) {
            addCriterionForJDBCDate("born not in", values, "born");
            return (Criteria) this;
        }

        public Criteria andBornBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("born between", value1, value2, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("born not between", value1, value2, "born");
            return (Criteria) this;
        }

        public Criteria andCultureIsNull() {
            addCriterion("culture is null");
            return (Criteria) this;
        }

        public Criteria andCultureIsNotNull() {
            addCriterion("culture is not null");
            return (Criteria) this;
        }

        public Criteria andCultureEqualTo(String value) {
            addCriterion("culture =", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureNotEqualTo(String value) {
            addCriterion("culture <>", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureGreaterThan(String value) {
            addCriterion("culture >", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureGreaterThanOrEqualTo(String value) {
            addCriterion("culture >=", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureLessThan(String value) {
            addCriterion("culture <", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureLessThanOrEqualTo(String value) {
            addCriterion("culture <=", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureLike(String value) {
            addCriterion("culture like", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureNotLike(String value) {
            addCriterion("culture not like", value, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureIn(List<String> values) {
            addCriterion("culture in", values, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureNotIn(List<String> values) {
            addCriterion("culture not in", values, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureBetween(String value1, String value2) {
            addCriterion("culture between", value1, value2, "culture");
            return (Criteria) this;
        }

        public Criteria andCultureNotBetween(String value1, String value2) {
            addCriterion("culture not between", value1, value2, "culture");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAboTypeIsNull() {
            addCriterion("abo_type is null");
            return (Criteria) this;
        }

        public Criteria andAboTypeIsNotNull() {
            addCriterion("abo_type is not null");
            return (Criteria) this;
        }

        public Criteria andAboTypeEqualTo(String value) {
            addCriterion("abo_type =", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeNotEqualTo(String value) {
            addCriterion("abo_type <>", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeGreaterThan(String value) {
            addCriterion("abo_type >", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeGreaterThanOrEqualTo(String value) {
            addCriterion("abo_type >=", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeLessThan(String value) {
            addCriterion("abo_type <", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeLessThanOrEqualTo(String value) {
            addCriterion("abo_type <=", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeLike(String value) {
            addCriterion("abo_type like", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeNotLike(String value) {
            addCriterion("abo_type not like", value, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeIn(List<String> values) {
            addCriterion("abo_type in", values, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeNotIn(List<String> values) {
            addCriterion("abo_type not in", values, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeBetween(String value1, String value2) {
            addCriterion("abo_type between", value1, value2, "aboType");
            return (Criteria) this;
        }

        public Criteria andAboTypeNotBetween(String value1, String value2) {
            addCriterion("abo_type not between", value1, value2, "aboType");
            return (Criteria) this;
        }

        public Criteria andRhTypeIsNull() {
            addCriterion("rh_type is null");
            return (Criteria) this;
        }

        public Criteria andRhTypeIsNotNull() {
            addCriterion("rh_type is not null");
            return (Criteria) this;
        }

        public Criteria andRhTypeEqualTo(String value) {
            addCriterion("rh_type =", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeNotEqualTo(String value) {
            addCriterion("rh_type <>", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeGreaterThan(String value) {
            addCriterion("rh_type >", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rh_type >=", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeLessThan(String value) {
            addCriterion("rh_type <", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeLessThanOrEqualTo(String value) {
            addCriterion("rh_type <=", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeLike(String value) {
            addCriterion("rh_type like", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeNotLike(String value) {
            addCriterion("rh_type not like", value, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeIn(List<String> values) {
            addCriterion("rh_type in", values, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeNotIn(List<String> values) {
            addCriterion("rh_type not in", values, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeBetween(String value1, String value2) {
            addCriterion("rh_type between", value1, value2, "rhType");
            return (Criteria) this;
        }

        public Criteria andRhTypeNotBetween(String value1, String value2) {
            addCriterion("rh_type not between", value1, value2, "rhType");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIsNull() {
            addCriterion("relationship_name is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIsNotNull() {
            addCriterion("relationship_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameEqualTo(String value) {
            addCriterion("relationship_name =", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotEqualTo(String value) {
            addCriterion("relationship_name <>", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameGreaterThan(String value) {
            addCriterion("relationship_name >", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_name >=", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLessThan(String value) {
            addCriterion("relationship_name <", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLessThanOrEqualTo(String value) {
            addCriterion("relationship_name <=", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLike(String value) {
            addCriterion("relationship_name like", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotLike(String value) {
            addCriterion("relationship_name not like", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIn(List<String> values) {
            addCriterion("relationship_name in", values, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotIn(List<String> values) {
            addCriterion("relationship_name not in", values, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameBetween(String value1, String value2) {
            addCriterion("relationship_name between", value1, value2, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotBetween(String value1, String value2) {
            addCriterion("relationship_name not between", value1, value2, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexIsNull() {
            addCriterion("relationship_sex is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexIsNotNull() {
            addCriterion("relationship_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexEqualTo(String value) {
            addCriterion("relationship_sex =", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexNotEqualTo(String value) {
            addCriterion("relationship_sex <>", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexGreaterThan(String value) {
            addCriterion("relationship_sex >", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_sex >=", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexLessThan(String value) {
            addCriterion("relationship_sex <", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexLessThanOrEqualTo(String value) {
            addCriterion("relationship_sex <=", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexLike(String value) {
            addCriterion("relationship_sex like", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexNotLike(String value) {
            addCriterion("relationship_sex not like", value, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexIn(List<String> values) {
            addCriterion("relationship_sex in", values, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexNotIn(List<String> values) {
            addCriterion("relationship_sex not in", values, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexBetween(String value1, String value2) {
            addCriterion("relationship_sex between", value1, value2, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipSexNotBetween(String value1, String value2) {
            addCriterion("relationship_sex not between", value1, value2, "relationshipSex");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressIsNull() {
            addCriterion("relationship_adress is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressIsNotNull() {
            addCriterion("relationship_adress is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressEqualTo(String value) {
            addCriterion("relationship_adress =", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressNotEqualTo(String value) {
            addCriterion("relationship_adress <>", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressGreaterThan(String value) {
            addCriterion("relationship_adress >", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_adress >=", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressLessThan(String value) {
            addCriterion("relationship_adress <", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressLessThanOrEqualTo(String value) {
            addCriterion("relationship_adress <=", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressLike(String value) {
            addCriterion("relationship_adress like", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressNotLike(String value) {
            addCriterion("relationship_adress not like", value, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressIn(List<String> values) {
            addCriterion("relationship_adress in", values, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressNotIn(List<String> values) {
            addCriterion("relationship_adress not in", values, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressBetween(String value1, String value2) {
            addCriterion("relationship_adress between", value1, value2, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipAdressNotBetween(String value1, String value2) {
            addCriterion("relationship_adress not between", value1, value2, "relationshipAdress");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailIsNull() {
            addCriterion("relationship_email is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailIsNotNull() {
            addCriterion("relationship_email is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailEqualTo(String value) {
            addCriterion("relationship_email =", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailNotEqualTo(String value) {
            addCriterion("relationship_email <>", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailGreaterThan(String value) {
            addCriterion("relationship_email >", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_email >=", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailLessThan(String value) {
            addCriterion("relationship_email <", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailLessThanOrEqualTo(String value) {
            addCriterion("relationship_email <=", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailLike(String value) {
            addCriterion("relationship_email like", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailNotLike(String value) {
            addCriterion("relationship_email not like", value, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailIn(List<String> values) {
            addCriterion("relationship_email in", values, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailNotIn(List<String> values) {
            addCriterion("relationship_email not in", values, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailBetween(String value1, String value2) {
            addCriterion("relationship_email between", value1, value2, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andRelationshipEmailNotBetween(String value1, String value2) {
            addCriterion("relationship_email not between", value1, value2, "relationshipEmail");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoIsNull() {
            addCriterion("account_book_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoIsNotNull() {
            addCriterion("account_book_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoEqualTo(String value) {
            addCriterion("account_book_no =", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoNotEqualTo(String value) {
            addCriterion("account_book_no <>", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoGreaterThan(String value) {
            addCriterion("account_book_no >", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_book_no >=", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoLessThan(String value) {
            addCriterion("account_book_no <", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoLessThanOrEqualTo(String value) {
            addCriterion("account_book_no <=", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoLike(String value) {
            addCriterion("account_book_no like", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoNotLike(String value) {
            addCriterion("account_book_no not like", value, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoIn(List<String> values) {
            addCriterion("account_book_no in", values, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoNotIn(List<String> values) {
            addCriterion("account_book_no not in", values, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoBetween(String value1, String value2) {
            addCriterion("account_book_no between", value1, value2, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andAccountBookNoNotBetween(String value1, String value2) {
            addCriterion("account_book_no not between", value1, value2, "accountBookNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoIsNull() {
            addCriterion("passport_no is null");
            return (Criteria) this;
        }

        public Criteria andPassportNoIsNotNull() {
            addCriterion("passport_no is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNoEqualTo(String value) {
            addCriterion("passport_no =", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotEqualTo(String value) {
            addCriterion("passport_no <>", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoGreaterThan(String value) {
            addCriterion("passport_no >", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoGreaterThanOrEqualTo(String value) {
            addCriterion("passport_no >=", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLessThan(String value) {
            addCriterion("passport_no <", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLessThanOrEqualTo(String value) {
            addCriterion("passport_no <=", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLike(String value) {
            addCriterion("passport_no like", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotLike(String value) {
            addCriterion("passport_no not like", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoIn(List<String> values) {
            addCriterion("passport_no in", values, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotIn(List<String> values) {
            addCriterion("passport_no not in", values, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoBetween(String value1, String value2) {
            addCriterion("passport_no between", value1, value2, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotBetween(String value1, String value2) {
            addCriterion("passport_no not between", value1, value2, "passportNo");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberIsNull() {
            addCriterion("officer_number is null");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberIsNotNull() {
            addCriterion("officer_number is not null");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberEqualTo(String value) {
            addCriterion("officer_number =", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberNotEqualTo(String value) {
            addCriterion("officer_number <>", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberGreaterThan(String value) {
            addCriterion("officer_number >", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("officer_number >=", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberLessThan(String value) {
            addCriterion("officer_number <", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberLessThanOrEqualTo(String value) {
            addCriterion("officer_number <=", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberLike(String value) {
            addCriterion("officer_number like", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberNotLike(String value) {
            addCriterion("officer_number not like", value, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberIn(List<String> values) {
            addCriterion("officer_number in", values, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberNotIn(List<String> values) {
            addCriterion("officer_number not in", values, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberBetween(String value1, String value2) {
            addCriterion("officer_number between", value1, value2, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andOfficerNumberNotBetween(String value1, String value2) {
            addCriterion("officer_number not between", value1, value2, "officerNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberIsNull() {
            addCriterion("driver_number is null");
            return (Criteria) this;
        }

        public Criteria andDriverNumberIsNotNull() {
            addCriterion("driver_number is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNumberEqualTo(String value) {
            addCriterion("driver_number =", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberNotEqualTo(String value) {
            addCriterion("driver_number <>", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberGreaterThan(String value) {
            addCriterion("driver_number >", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberGreaterThanOrEqualTo(String value) {
            addCriterion("driver_number >=", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberLessThan(String value) {
            addCriterion("driver_number <", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberLessThanOrEqualTo(String value) {
            addCriterion("driver_number <=", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberLike(String value) {
            addCriterion("driver_number like", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberNotLike(String value) {
            addCriterion("driver_number not like", value, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberIn(List<String> values) {
            addCriterion("driver_number in", values, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberNotIn(List<String> values) {
            addCriterion("driver_number not in", values, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberBetween(String value1, String value2) {
            addCriterion("driver_number between", value1, value2, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andDriverNumberNotBetween(String value1, String value2) {
            addCriterion("driver_number not between", value1, value2, "driverNumber");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoIsNull() {
            addCriterion("hong_kong_and_macao_pass_no is null");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoIsNotNull() {
            addCriterion("hong_kong_and_macao_pass_no is not null");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoEqualTo(String value) {
            addCriterion("hong_kong_and_macao_pass_no =", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoNotEqualTo(String value) {
            addCriterion("hong_kong_and_macao_pass_no <>", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoGreaterThan(String value) {
            addCriterion("hong_kong_and_macao_pass_no >", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoGreaterThanOrEqualTo(String value) {
            addCriterion("hong_kong_and_macao_pass_no >=", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoLessThan(String value) {
            addCriterion("hong_kong_and_macao_pass_no <", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoLessThanOrEqualTo(String value) {
            addCriterion("hong_kong_and_macao_pass_no <=", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoLike(String value) {
            addCriterion("hong_kong_and_macao_pass_no like", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoNotLike(String value) {
            addCriterion("hong_kong_and_macao_pass_no not like", value, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoIn(List<String> values) {
            addCriterion("hong_kong_and_macao_pass_no in", values, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoNotIn(List<String> values) {
            addCriterion("hong_kong_and_macao_pass_no not in", values, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoBetween(String value1, String value2) {
            addCriterion("hong_kong_and_macao_pass_no between", value1, value2, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andHongKongAndMacaoPassNoNotBetween(String value1, String value2) {
            addCriterion("hong_kong_and_macao_pass_no not between", value1, value2, "hongKongAndMacaoPassNo");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberIsNull() {
            addCriterion("taiwan_pass_number is null");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberIsNotNull() {
            addCriterion("taiwan_pass_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberEqualTo(String value) {
            addCriterion("taiwan_pass_number =", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberNotEqualTo(String value) {
            addCriterion("taiwan_pass_number <>", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberGreaterThan(String value) {
            addCriterion("taiwan_pass_number >", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberGreaterThanOrEqualTo(String value) {
            addCriterion("taiwan_pass_number >=", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberLessThan(String value) {
            addCriterion("taiwan_pass_number <", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberLessThanOrEqualTo(String value) {
            addCriterion("taiwan_pass_number <=", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberLike(String value) {
            addCriterion("taiwan_pass_number like", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberNotLike(String value) {
            addCriterion("taiwan_pass_number not like", value, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberIn(List<String> values) {
            addCriterion("taiwan_pass_number in", values, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberNotIn(List<String> values) {
            addCriterion("taiwan_pass_number not in", values, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberBetween(String value1, String value2) {
            addCriterion("taiwan_pass_number between", value1, value2, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andTaiwanPassNumberNotBetween(String value1, String value2) {
            addCriterion("taiwan_pass_number not between", value1, value2, "taiwanPassNumber");
            return (Criteria) this;
        }

        public Criteria andStatureIsNull() {
            addCriterion("stature is null");
            return (Criteria) this;
        }

        public Criteria andStatureIsNotNull() {
            addCriterion("stature is not null");
            return (Criteria) this;
        }

        public Criteria andStatureEqualTo(Double value) {
            addCriterion("stature =", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotEqualTo(Double value) {
            addCriterion("stature <>", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureGreaterThan(Double value) {
            addCriterion("stature >", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureGreaterThanOrEqualTo(Double value) {
            addCriterion("stature >=", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureLessThan(Double value) {
            addCriterion("stature <", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureLessThanOrEqualTo(Double value) {
            addCriterion("stature <=", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureIn(List<Double> values) {
            addCriterion("stature in", values, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotIn(List<Double> values) {
            addCriterion("stature not in", values, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureBetween(Double value1, Double value2) {
            addCriterion("stature between", value1, value2, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotBetween(Double value1, Double value2) {
            addCriterion("stature not between", value1, value2, "stature");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBmiIsNull() {
            addCriterion("bmi is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("bmi is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(String value) {
            addCriterion("bmi =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(String value) {
            addCriterion("bmi <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(String value) {
            addCriterion("bmi >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(String value) {
            addCriterion("bmi >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(String value) {
            addCriterion("bmi <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(String value) {
            addCriterion("bmi <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLike(String value) {
            addCriterion("bmi like", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotLike(String value) {
            addCriterion("bmi not like", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<String> values) {
            addCriterion("bmi in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<String> values) {
            addCriterion("bmi not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(String value1, String value2) {
            addCriterion("bmi between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(String value1, String value2) {
            addCriterion("bmi not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
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