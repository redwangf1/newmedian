package com.alphonse.accountmanage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNull() {
            addCriterion("institutiontype is null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNotNull() {
            addCriterion("institutiontype is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeEqualTo(String value) {
            addCriterion("institutiontype =", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotEqualTo(String value) {
            addCriterion("institutiontype <>", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThan(String value) {
            addCriterion("institutiontype >", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("institutiontype >=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThan(String value) {
            addCriterion("institutiontype <", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThanOrEqualTo(String value) {
            addCriterion("institutiontype <=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLike(String value) {
            addCriterion("institutiontype like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotLike(String value) {
            addCriterion("institutiontype not like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIn(List<String> values) {
            addCriterion("institutiontype in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotIn(List<String> values) {
            addCriterion("institutiontype not in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeBetween(String value1, String value2) {
            addCriterion("institutiontype between", value1, value2, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotBetween(String value1, String value2) {
            addCriterion("institutiontype not between", value1, value2, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIsNull() {
            addCriterion("institutionname is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIsNotNull() {
            addCriterion("institutionname is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameEqualTo(String value) {
            addCriterion("institutionname =", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotEqualTo(String value) {
            addCriterion("institutionname <>", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameGreaterThan(String value) {
            addCriterion("institutionname >", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameGreaterThanOrEqualTo(String value) {
            addCriterion("institutionname >=", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLessThan(String value) {
            addCriterion("institutionname <", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLessThanOrEqualTo(String value) {
            addCriterion("institutionname <=", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLike(String value) {
            addCriterion("institutionname like", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotLike(String value) {
            addCriterion("institutionname not like", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIn(List<String> values) {
            addCriterion("institutionname in", values, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotIn(List<String> values) {
            addCriterion("institutionname not in", values, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameBetween(String value1, String value2) {
            addCriterion("institutionname between", value1, value2, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotBetween(String value1, String value2) {
            addCriterion("institutionname not between", value1, value2, "institutionname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("channelname is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("channelname is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("channelname =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("channelname <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("channelname >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("channelname >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("channelname <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("channelname <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("channelname like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("channelname not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("channelname in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("channelname not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("channelname between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("channelname not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNull() {
            addCriterion("programname is null");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNotNull() {
            addCriterion("programname is not null");
            return (Criteria) this;
        }

        public Criteria andProgramnameEqualTo(String value) {
            addCriterion("programname =", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotEqualTo(String value) {
            addCriterion("programname <>", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThan(String value) {
            addCriterion("programname >", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThanOrEqualTo(String value) {
            addCriterion("programname >=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThan(String value) {
            addCriterion("programname <", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThanOrEqualTo(String value) {
            addCriterion("programname <=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLike(String value) {
            addCriterion("programname like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotLike(String value) {
            addCriterion("programname not like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameIn(List<String> values) {
            addCriterion("programname in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotIn(List<String> values) {
            addCriterion("programname not in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameBetween(String value1, String value2) {
            addCriterion("programname between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotBetween(String value1, String value2) {
            addCriterion("programname not between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("accounttype is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("accounttype is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(String value) {
            addCriterion("accounttype =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(String value) {
            addCriterion("accounttype <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(String value) {
            addCriterion("accounttype >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accounttype >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(String value) {
            addCriterion("accounttype <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(String value) {
            addCriterion("accounttype <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLike(String value) {
            addCriterion("accounttype like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotLike(String value) {
            addCriterion("accounttype not like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<String> values) {
            addCriterion("accounttype in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<String> values) {
            addCriterion("accounttype not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(String value1, String value2) {
            addCriterion("accounttype between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(String value1, String value2) {
            addCriterion("accounttype not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccountplaceIsNull() {
            addCriterion("accountplace is null");
            return (Criteria) this;
        }

        public Criteria andAccountplaceIsNotNull() {
            addCriterion("accountplace is not null");
            return (Criteria) this;
        }

        public Criteria andAccountplaceEqualTo(Date value) {
            addCriterion("accountplace =", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceNotEqualTo(Date value) {
            addCriterion("accountplace <>", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceGreaterThan(Date value) {
            addCriterion("accountplace >", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceGreaterThanOrEqualTo(Date value) {
            addCriterion("accountplace >=", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceLessThan(Date value) {
            addCriterion("accountplace <", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceLessThanOrEqualTo(Date value) {
            addCriterion("accountplace <=", value, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceIn(List<Date> values) {
            addCriterion("accountplace in", values, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceNotIn(List<Date> values) {
            addCriterion("accountplace not in", values, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceBetween(Date value1, Date value2) {
            addCriterion("accountplace between", value1, value2, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountplaceNotBetween(Date value1, Date value2) {
            addCriterion("accountplace not between", value1, value2, "accountplace");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountid is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("accountid =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("accountid <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("accountid >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("accountid >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("accountid <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("accountid <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("accountid like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("accountid not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("accountid in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("accountid not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("accountid between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("accountid not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningIsNull() {
            addCriterion("accountcontentpositioning is null");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningIsNotNull() {
            addCriterion("accountcontentpositioning is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningEqualTo(String value) {
            addCriterion("accountcontentpositioning =", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningNotEqualTo(String value) {
            addCriterion("accountcontentpositioning <>", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningGreaterThan(String value) {
            addCriterion("accountcontentpositioning >", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningGreaterThanOrEqualTo(String value) {
            addCriterion("accountcontentpositioning >=", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningLessThan(String value) {
            addCriterion("accountcontentpositioning <", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningLessThanOrEqualTo(String value) {
            addCriterion("accountcontentpositioning <=", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningLike(String value) {
            addCriterion("accountcontentpositioning like", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningNotLike(String value) {
            addCriterion("accountcontentpositioning not like", value, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningIn(List<String> values) {
            addCriterion("accountcontentpositioning in", values, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningNotIn(List<String> values) {
            addCriterion("accountcontentpositioning not in", values, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningBetween(String value1, String value2) {
            addCriterion("accountcontentpositioning between", value1, value2, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAccountcontentpositioningNotBetween(String value1, String value2) {
            addCriterion("accountcontentpositioning not between", value1, value2, "accountcontentpositioning");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNull() {
            addCriterion("authentication is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNotNull() {
            addCriterion("authentication is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationEqualTo(String value) {
            addCriterion("authentication =", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotEqualTo(String value) {
            addCriterion("authentication <>", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThan(String value) {
            addCriterion("authentication >", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("authentication >=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThan(String value) {
            addCriterion("authentication <", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("authentication <=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLike(String value) {
            addCriterion("authentication like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotLike(String value) {
            addCriterion("authentication not like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIn(List<String> values) {
            addCriterion("authentication in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotIn(List<String> values) {
            addCriterion("authentication not in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationBetween(String value1, String value2) {
            addCriterion("authentication between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotBetween(String value1, String value2) {
            addCriterion("authentication not between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionIsNull() {
            addCriterion("authinsitution is null");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionIsNotNull() {
            addCriterion("authinsitution is not null");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionEqualTo(String value) {
            addCriterion("authinsitution =", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionNotEqualTo(String value) {
            addCriterion("authinsitution <>", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionGreaterThan(String value) {
            addCriterion("authinsitution >", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionGreaterThanOrEqualTo(String value) {
            addCriterion("authinsitution >=", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionLessThan(String value) {
            addCriterion("authinsitution <", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionLessThanOrEqualTo(String value) {
            addCriterion("authinsitution <=", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionLike(String value) {
            addCriterion("authinsitution like", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionNotLike(String value) {
            addCriterion("authinsitution not like", value, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionIn(List<String> values) {
            addCriterion("authinsitution in", values, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionNotIn(List<String> values) {
            addCriterion("authinsitution not in", values, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionBetween(String value1, String value2) {
            addCriterion("authinsitution between", value1, value2, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAuthinsitutionNotBetween(String value1, String value2) {
            addCriterion("authinsitution not between", value1, value2, "authinsitution");
            return (Criteria) this;
        }

        public Criteria andAbstractsIsNull() {
            addCriterion("abstracts is null");
            return (Criteria) this;
        }

        public Criteria andAbstractsIsNotNull() {
            addCriterion("abstracts is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractsEqualTo(String value) {
            addCriterion("abstracts =", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotEqualTo(String value) {
            addCriterion("abstracts <>", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsGreaterThan(String value) {
            addCriterion("abstracts >", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsGreaterThanOrEqualTo(String value) {
            addCriterion("abstracts >=", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLessThan(String value) {
            addCriterion("abstracts <", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLessThanOrEqualTo(String value) {
            addCriterion("abstracts <=", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLike(String value) {
            addCriterion("abstracts like", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotLike(String value) {
            addCriterion("abstracts not like", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsIn(List<String> values) {
            addCriterion("abstracts in", values, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotIn(List<String> values) {
            addCriterion("abstracts not in", values, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsBetween(String value1, String value2) {
            addCriterion("abstracts between", value1, value2, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotBetween(String value1, String value2) {
            addCriterion("abstracts not between", value1, value2, "abstracts");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNull() {
            addCriterion("uploadstate is null");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNotNull() {
            addCriterion("uploadstate is not null");
            return (Criteria) this;
        }

        public Criteria andUploadstateEqualTo(String value) {
            addCriterion("uploadstate =", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotEqualTo(String value) {
            addCriterion("uploadstate <>", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThan(String value) {
            addCriterion("uploadstate >", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThanOrEqualTo(String value) {
            addCriterion("uploadstate >=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThan(String value) {
            addCriterion("uploadstate <", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThanOrEqualTo(String value) {
            addCriterion("uploadstate <=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLike(String value) {
            addCriterion("uploadstate like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotLike(String value) {
            addCriterion("uploadstate not like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateIn(List<String> values) {
            addCriterion("uploadstate in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotIn(List<String> values) {
            addCriterion("uploadstate not in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateBetween(String value1, String value2) {
            addCriterion("uploadstate between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotBetween(String value1, String value2) {
            addCriterion("uploadstate not between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("auditstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(String value) {
            addCriterion("auditstate =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(String value) {
            addCriterion("auditstate <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(String value) {
            addCriterion("auditstate >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(String value) {
            addCriterion("auditstate >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(String value) {
            addCriterion("auditstate <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(String value) {
            addCriterion("auditstate <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLike(String value) {
            addCriterion("auditstate like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotLike(String value) {
            addCriterion("auditstate not like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<String> values) {
            addCriterion("auditstate in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<String> values) {
            addCriterion("auditstate not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(String value1, String value2) {
            addCriterion("auditstate between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(String value1, String value2) {
            addCriterion("auditstate not between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameIsNull() {
            addCriterion("thirdpartyname is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameIsNotNull() {
            addCriterion("thirdpartyname is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameEqualTo(String value) {
            addCriterion("thirdpartyname =", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameNotEqualTo(String value) {
            addCriterion("thirdpartyname <>", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameGreaterThan(String value) {
            addCriterion("thirdpartyname >", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameGreaterThanOrEqualTo(String value) {
            addCriterion("thirdpartyname >=", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameLessThan(String value) {
            addCriterion("thirdpartyname <", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameLessThanOrEqualTo(String value) {
            addCriterion("thirdpartyname <=", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameLike(String value) {
            addCriterion("thirdpartyname like", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameNotLike(String value) {
            addCriterion("thirdpartyname not like", value, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameIn(List<String> values) {
            addCriterion("thirdpartyname in", values, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameNotIn(List<String> values) {
            addCriterion("thirdpartyname not in", values, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameBetween(String value1, String value2) {
            addCriterion("thirdpartyname between", value1, value2, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartynameNotBetween(String value1, String value2) {
            addCriterion("thirdpartyname not between", value1, value2, "thirdpartyname");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameIsNull() {
            addCriterion("thirdpartyuploadername is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameIsNotNull() {
            addCriterion("thirdpartyuploadername is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameEqualTo(String value) {
            addCriterion("thirdpartyuploadername =", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameNotEqualTo(String value) {
            addCriterion("thirdpartyuploadername <>", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameGreaterThan(String value) {
            addCriterion("thirdpartyuploadername >", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameGreaterThanOrEqualTo(String value) {
            addCriterion("thirdpartyuploadername >=", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameLessThan(String value) {
            addCriterion("thirdpartyuploadername <", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameLessThanOrEqualTo(String value) {
            addCriterion("thirdpartyuploadername <=", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameLike(String value) {
            addCriterion("thirdpartyuploadername like", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameNotLike(String value) {
            addCriterion("thirdpartyuploadername not like", value, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameIn(List<String> values) {
            addCriterion("thirdpartyuploadername in", values, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameNotIn(List<String> values) {
            addCriterion("thirdpartyuploadername not in", values, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameBetween(String value1, String value2) {
            addCriterion("thirdpartyuploadername between", value1, value2, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andThirdpartyuploadernameNotBetween(String value1, String value2) {
            addCriterion("thirdpartyuploadername not between", value1, value2, "thirdpartyuploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameIsNull() {
            addCriterion("uploadername is null");
            return (Criteria) this;
        }

        public Criteria andUploadernameIsNotNull() {
            addCriterion("uploadername is not null");
            return (Criteria) this;
        }

        public Criteria andUploadernameEqualTo(String value) {
            addCriterion("uploadername =", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameNotEqualTo(String value) {
            addCriterion("uploadername <>", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameGreaterThan(String value) {
            addCriterion("uploadername >", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameGreaterThanOrEqualTo(String value) {
            addCriterion("uploadername >=", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameLessThan(String value) {
            addCriterion("uploadername <", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameLessThanOrEqualTo(String value) {
            addCriterion("uploadername <=", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameLike(String value) {
            addCriterion("uploadername like", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameNotLike(String value) {
            addCriterion("uploadername not like", value, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameIn(List<String> values) {
            addCriterion("uploadername in", values, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameNotIn(List<String> values) {
            addCriterion("uploadername not in", values, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameBetween(String value1, String value2) {
            addCriterion("uploadername between", value1, value2, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUploadernameNotBetween(String value1, String value2) {
            addCriterion("uploadername not between", value1, value2, "uploadername");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("ext5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("ext5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("ext5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ext5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("ext5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("ext5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("ext5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("ext5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("ext5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("ext5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("ext5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("ext5 not between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt6IsNull() {
            addCriterion("ext6 is null");
            return (Criteria) this;
        }

        public Criteria andExt6IsNotNull() {
            addCriterion("ext6 is not null");
            return (Criteria) this;
        }

        public Criteria andExt6EqualTo(String value) {
            addCriterion("ext6 =", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotEqualTo(String value) {
            addCriterion("ext6 <>", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThan(String value) {
            addCriterion("ext6 >", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThanOrEqualTo(String value) {
            addCriterion("ext6 >=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThan(String value) {
            addCriterion("ext6 <", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThanOrEqualTo(String value) {
            addCriterion("ext6 <=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Like(String value) {
            addCriterion("ext6 like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotLike(String value) {
            addCriterion("ext6 not like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6In(List<String> values) {
            addCriterion("ext6 in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotIn(List<String> values) {
            addCriterion("ext6 not in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Between(String value1, String value2) {
            addCriterion("ext6 between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotBetween(String value1, String value2) {
            addCriterion("ext6 not between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt7IsNull() {
            addCriterion("ext7 is null");
            return (Criteria) this;
        }

        public Criteria andExt7IsNotNull() {
            addCriterion("ext7 is not null");
            return (Criteria) this;
        }

        public Criteria andExt7EqualTo(String value) {
            addCriterion("ext7 =", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotEqualTo(String value) {
            addCriterion("ext7 <>", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThan(String value) {
            addCriterion("ext7 >", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThanOrEqualTo(String value) {
            addCriterion("ext7 >=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThan(String value) {
            addCriterion("ext7 <", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThanOrEqualTo(String value) {
            addCriterion("ext7 <=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Like(String value) {
            addCriterion("ext7 like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotLike(String value) {
            addCriterion("ext7 not like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7In(List<String> values) {
            addCriterion("ext7 in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotIn(List<String> values) {
            addCriterion("ext7 not in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Between(String value1, String value2) {
            addCriterion("ext7 between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotBetween(String value1, String value2) {
            addCriterion("ext7 not between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt8IsNull() {
            addCriterion("ext8 is null");
            return (Criteria) this;
        }

        public Criteria andExt8IsNotNull() {
            addCriterion("ext8 is not null");
            return (Criteria) this;
        }

        public Criteria andExt8EqualTo(String value) {
            addCriterion("ext8 =", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotEqualTo(String value) {
            addCriterion("ext8 <>", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThan(String value) {
            addCriterion("ext8 >", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThanOrEqualTo(String value) {
            addCriterion("ext8 >=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThan(String value) {
            addCriterion("ext8 <", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThanOrEqualTo(String value) {
            addCriterion("ext8 <=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Like(String value) {
            addCriterion("ext8 like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotLike(String value) {
            addCriterion("ext8 not like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8In(List<String> values) {
            addCriterion("ext8 in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotIn(List<String> values) {
            addCriterion("ext8 not in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Between(String value1, String value2) {
            addCriterion("ext8 between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotBetween(String value1, String value2) {
            addCriterion("ext8 not between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt9IsNull() {
            addCriterion("ext9 is null");
            return (Criteria) this;
        }

        public Criteria andExt9IsNotNull() {
            addCriterion("ext9 is not null");
            return (Criteria) this;
        }

        public Criteria andExt9EqualTo(String value) {
            addCriterion("ext9 =", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotEqualTo(String value) {
            addCriterion("ext9 <>", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9GreaterThan(String value) {
            addCriterion("ext9 >", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9GreaterThanOrEqualTo(String value) {
            addCriterion("ext9 >=", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9LessThan(String value) {
            addCriterion("ext9 <", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9LessThanOrEqualTo(String value) {
            addCriterion("ext9 <=", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9Like(String value) {
            addCriterion("ext9 like", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotLike(String value) {
            addCriterion("ext9 not like", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9In(List<String> values) {
            addCriterion("ext9 in", values, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotIn(List<String> values) {
            addCriterion("ext9 not in", values, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9Between(String value1, String value2) {
            addCriterion("ext9 between", value1, value2, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotBetween(String value1, String value2) {
            addCriterion("ext9 not between", value1, value2, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt10IsNull() {
            addCriterion("ext10 is null");
            return (Criteria) this;
        }

        public Criteria andExt10IsNotNull() {
            addCriterion("ext10 is not null");
            return (Criteria) this;
        }

        public Criteria andExt10EqualTo(String value) {
            addCriterion("ext10 =", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotEqualTo(String value) {
            addCriterion("ext10 <>", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10GreaterThan(String value) {
            addCriterion("ext10 >", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10GreaterThanOrEqualTo(String value) {
            addCriterion("ext10 >=", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10LessThan(String value) {
            addCriterion("ext10 <", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10LessThanOrEqualTo(String value) {
            addCriterion("ext10 <=", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10Like(String value) {
            addCriterion("ext10 like", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotLike(String value) {
            addCriterion("ext10 not like", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10In(List<String> values) {
            addCriterion("ext10 in", values, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotIn(List<String> values) {
            addCriterion("ext10 not in", values, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10Between(String value1, String value2) {
            addCriterion("ext10 between", value1, value2, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotBetween(String value1, String value2) {
            addCriterion("ext10 not between", value1, value2, "ext10");
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