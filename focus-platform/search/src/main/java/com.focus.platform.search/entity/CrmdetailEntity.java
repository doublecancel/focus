package com.focus.platform.search.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "crmdetail", schema = "crmdetail", catalog = "")
public class CrmdetailEntity {
    private Integer bcid;
    private String address;
    private String name;
    private String unit;
    private Integer uid;
    private String sign;
    private Timestamp ctime;
    private String sex;
    private String email;
    private String mobile;
    private String area;
    private String tel;
    private Timestamp utime;
    private String qq;
    private String card;
    private String otherinfo;
    private String unitaddress;
    private String jwpassport;
    private Timestamp birthday;
    private String custype;
    private String cuslevel;
    private String purpose;
    private String buyplan;
    private String firstdemand;
    private String intentionbuild;
    private String intentionarea;
    private String intentionfamily;
    private String intentionproperty;
    private String intentiondegrees;
    private String intentionsize;
    private String intentionprice;
    private String buildingtype;
    private String traffic;
    private String supporting;
    private String brand;
    private String demandremark;
    private String cusremark;
    private String zstatus;
    private Integer istrad;
    private Timestamp istradtime;
    private String citys;
    private String followed;
    private Integer isnext;
    private Timestamp nexttime;
    private String followedname;
    private String cusNeeds;
    private String needremark;
    private String downremark;
    private String uname;
    private String fields1;
    private String fields2;
    private String fields3;
    private Integer followstatus;
    private String type;
    private Integer isorder;
    private Integer intentionAreaId;
    private Integer intentionDid;
    private String intentionDname;
    private Integer disId;
    private String disName;
    private Integer areaId;
    private Timestamp signTime;
    private Timestamp followTime;
    private Integer cid;
    private String cname;
    private Integer plan;
    private String bcidStr;
    private Integer jiwuid;
    private Integer timeage;
    private Integer timeday;
    private Integer timenum;
    private String mobileLink;
    private Integer timesign;
    private Integer ispay;
    private Integer rechip;
    private Integer refund;
    private Timestamp ctimeBak;
    private Integer source;
    private Integer equipment;

    @Id
    @Column(name = "BCID", nullable = false)
    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Unit", nullable = true, length = 100)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "uid", nullable = false)
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "Sign", nullable = true, length = 30)
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "ctime", nullable = true)
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "Sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Mobile", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "Area", nullable = true, length = 50)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "Tel", nullable = true, length = 50)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "utime", nullable = true)
    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "QQ", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "Card", nullable = true, length = 20)
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Basic
    @Column(name = "Otherinfo", nullable = true, length = 100)
    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

    @Basic
    @Column(name = "Unitaddress", nullable = true, length = 100)
    public String getUnitaddress() {
        return unitaddress;
    }

    public void setUnitaddress(String unitaddress) {
        this.unitaddress = unitaddress;
    }

    @Basic
    @Column(name = "Jwpassport", nullable = true, length = 50)
    public String getJwpassport() {
        return jwpassport;
    }

    public void setJwpassport(String jwpassport) {
        this.jwpassport = jwpassport;
    }

    @Basic
    @Column(name = "Birthday", nullable = true)
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "Custype", nullable = true, length = 50)
    public String getCustype() {
        return custype;
    }

    public void setCustype(String custype) {
        this.custype = custype;
    }

    @Basic
    @Column(name = "Cuslevel", nullable = true, length = 20)
    public String getCuslevel() {
        return cuslevel;
    }

    public void setCuslevel(String cuslevel) {
        this.cuslevel = cuslevel;
    }

    @Basic
    @Column(name = "Purpose", nullable = true, length = 100)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "Buyplan", nullable = true, length = 100)
    public String getBuyplan() {
        return buyplan;
    }

    public void setBuyplan(String buyplan) {
        this.buyplan = buyplan;
    }

    @Basic
    @Column(name = "Firstdemand", nullable = true, length = 100)
    public String getFirstdemand() {
        return firstdemand;
    }

    public void setFirstdemand(String firstdemand) {
        this.firstdemand = firstdemand;
    }

    @Basic
    @Column(name = "Intentionbuild", nullable = true, length = 5000)
    public String getIntentionbuild() {
        return intentionbuild;
    }

    public void setIntentionbuild(String intentionbuild) {
        this.intentionbuild = intentionbuild;
    }

    @Basic
    @Column(name = "intentionarea", nullable = true, length = 3000)
    public String getIntentionarea() {
        return intentionarea;
    }

    public void setIntentionarea(String intentionarea) {
        this.intentionarea = intentionarea;
    }

    @Basic
    @Column(name = "Intentionfamily", nullable = true, length = 100)
    public String getIntentionfamily() {
        return intentionfamily;
    }

    public void setIntentionfamily(String intentionfamily) {
        this.intentionfamily = intentionfamily;
    }

    @Basic
    @Column(name = "Intentionproperty", nullable = true, length = 100)
    public String getIntentionproperty() {
        return intentionproperty;
    }

    public void setIntentionproperty(String intentionproperty) {
        this.intentionproperty = intentionproperty;
    }

    @Basic
    @Column(name = "Intentiondegrees", nullable = true, length = 3000)
    public String getIntentiondegrees() {
        return intentiondegrees;
    }

    public void setIntentiondegrees(String intentiondegrees) {
        this.intentiondegrees = intentiondegrees;
    }

    @Basic
    @Column(name = "Intentionsize", nullable = true, length = 100)
    public String getIntentionsize() {
        return intentionsize;
    }

    public void setIntentionsize(String intentionsize) {
        this.intentionsize = intentionsize;
    }

    @Basic
    @Column(name = "Intentionprice", nullable = true, length = 100)
    public String getIntentionprice() {
        return intentionprice;
    }

    public void setIntentionprice(String intentionprice) {
        this.intentionprice = intentionprice;
    }

    @Basic
    @Column(name = "Buildingtype", nullable = true, length = 100)
    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype;
    }

    @Basic
    @Column(name = "Traffic", nullable = true, length = 100)
    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    @Basic
    @Column(name = "Supporting", nullable = true, length = 100)
    public String getSupporting() {
        return supporting;
    }

    public void setSupporting(String supporting) {
        this.supporting = supporting;
    }

    @Basic
    @Column(name = "Brand", nullable = true, length = 100)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "Demandremark", nullable = true, length = -1)
    public String getDemandremark() {
        return demandremark;
    }

    public void setDemandremark(String demandremark) {
        this.demandremark = demandremark;
    }

    @Basic
    @Column(name = "Cusremark", nullable = true, length = -1)
    public String getCusremark() {
        return cusremark;
    }

    public void setCusremark(String cusremark) {
        this.cusremark = cusremark;
    }

    @Basic
    @Column(name = "Zstatus", nullable = true, length = 50)
    public String getZstatus() {
        return zstatus;
    }

    public void setZstatus(String zstatus) {
        this.zstatus = zstatus;
    }

    @Basic
    @Column(name = "Istrad", nullable = false)
    public Integer getIstrad() {
        return istrad;
    }

    public void setIstrad(Integer istrad) {
        this.istrad = istrad;
    }

    @Basic
    @Column(name = "Istradtime", nullable = true)
    public Timestamp getIstradtime() {
        return istradtime;
    }

    public void setIstradtime(Timestamp istradtime) {
        this.istradtime = istradtime;
    }

    @Basic
    @Column(name = "Citys", nullable = true, length = 200)
    public String getCitys() {
        return citys;
    }

    public void setCitys(String citys) {
        this.citys = citys;
    }

    @Basic
    @Column(name = "Followed", nullable = true, length = 20)
    public String getFollowed() {
        return followed;
    }

    public void setFollowed(String followed) {
        this.followed = followed;
    }

    @Basic
    @Column(name = "Isnext", nullable = false)
    public Integer getIsnext() {
        return isnext;
    }

    public void setIsnext(Integer isnext) {
        this.isnext = isnext;
    }

    @Basic
    @Column(name = "Nexttime", nullable = true)
    public Timestamp getNexttime() {
        return nexttime;
    }

    public void setNexttime(Timestamp nexttime) {
        this.nexttime = nexttime;
    }

    @Basic
    @Column(name = "Followedname", nullable = true, length = 50)
    public String getFollowedname() {
        return followedname;
    }

    public void setFollowedname(String followedname) {
        this.followedname = followedname;
    }

    @Basic
    @Column(name = "CusNeeds", nullable = true, length = 255)
    public String getCusNeeds() {
        return cusNeeds;
    }

    public void setCusNeeds(String cusNeeds) {
        this.cusNeeds = cusNeeds;
    }

    @Basic
    @Column(name = "Needremark", nullable = true, length = -1)
    public String getNeedremark() {
        return needremark;
    }

    public void setNeedremark(String needremark) {
        this.needremark = needremark;
    }

    @Basic
    @Column(name = "Downremark", nullable = true, length = -1)
    public String getDownremark() {
        return downremark;
    }

    public void setDownremark(String downremark) {
        this.downremark = downremark;
    }

    @Basic
    @Column(name = "Uname", nullable = true, length = 20)
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "Fields1", nullable = true, length = 2000)
    public String getFields1() {
        return fields1;
    }

    public void setFields1(String fields1) {
        this.fields1 = fields1;
    }

    @Basic
    @Column(name = "Fields2", nullable = true, length = 2000)
    public String getFields2() {
        return fields2;
    }

    public void setFields2(String fields2) {
        this.fields2 = fields2;
    }

    @Basic
    @Column(name = "Fields3", nullable = true, length = 2000)
    public String getFields3() {
        return fields3;
    }

    public void setFields3(String fields3) {
        this.fields3 = fields3;
    }

    @Basic
    @Column(name = "Followstatus", nullable = false)
    public Integer getFollowstatus() {
        return followstatus;
    }

    public void setFollowstatus(Integer followstatus) {
        this.followstatus = followstatus;
    }

    @Basic
    @Column(name = "Type", nullable = true, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Isorder", nullable = false)
    public Integer getIsorder() {
        return isorder;
    }

    public void setIsorder(Integer isorder) {
        this.isorder = isorder;
    }

    @Basic
    @Column(name = "IntentionAreaID", nullable = false)
    public Integer getIntentionAreaId() {
        return intentionAreaId;
    }

    public void setIntentionAreaId(Integer intentionAreaId) {
        this.intentionAreaId = intentionAreaId;
    }

    @Basic
    @Column(name = "IntentionDID", nullable = false)
    public Integer getIntentionDid() {
        return intentionDid;
    }

    public void setIntentionDid(Integer intentionDid) {
        this.intentionDid = intentionDid;
    }

    @Basic
    @Column(name = "IntentionDname", nullable = true, length = 255)
    public String getIntentionDname() {
        return intentionDname;
    }

    public void setIntentionDname(String intentionDname) {
        this.intentionDname = intentionDname;
    }

    @Basic
    @Column(name = "DisID", nullable = false)
    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    @Basic
    @Column(name = "DisName", nullable = true, length = 255)
    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    @Basic
    @Column(name = "AreaId", nullable = false)
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "SignTime", nullable = true)
    public Timestamp getSignTime() {
        return signTime;
    }

    public void setSignTime(Timestamp signTime) {
        this.signTime = signTime;
    }

    @Basic
    @Column(name = "FollowTime", nullable = true)
    public Timestamp getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Timestamp followTime) {
        this.followTime = followTime;
    }

    @Basic
    @Column(name = "CID", nullable = false)
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "CNAME", nullable = true, length = 50)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "Plan", nullable = false)
    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    @Basic
    @Column(name = "bcidStr", nullable = true, length = 255)
    public String getBcidStr() {
        return bcidStr;
    }

    public void setBcidStr(String bcidStr) {
        this.bcidStr = bcidStr;
    }

    @Basic
    @Column(name = "JIWUID", nullable = false)
    public Integer getJiwuid() {
        return jiwuid;
    }

    public void setJiwuid(Integer jiwuid) {
        this.jiwuid = jiwuid;
    }

    @Basic
    @Column(name = "Timeage", nullable = false)
    public Integer getTimeage() {
        return timeage;
    }

    public void setTimeage(Integer timeage) {
        this.timeage = timeage;
    }

    @Basic
    @Column(name = "Timeday", nullable = false)
    public Integer getTimeday() {
        return timeday;
    }

    public void setTimeday(Integer timeday) {
        this.timeday = timeday;
    }

    @Basic
    @Column(name = "Timenum", nullable = false)
    public Integer getTimenum() {
        return timenum;
    }

    public void setTimenum(Integer timenum) {
        this.timenum = timenum;
    }

    @Basic
    @Column(name = "MobileLink", nullable = true, length = 255)
    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @Basic
    @Column(name = "timesign", nullable = false)
    public Integer getTimesign() {
        return timesign;
    }

    public void setTimesign(Integer timesign) {
        this.timesign = timesign;
    }

    @Basic
    @Column(name = "Ispay", nullable = false)
    public Integer getIspay() {
        return ispay;
    }

    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    @Basic
    @Column(name = "Rechip", nullable = false)
    public Integer getRechip() {
        return rechip;
    }

    public void setRechip(Integer rechip) {
        this.rechip = rechip;
    }

    @Basic
    @Column(name = "Refund", nullable = false)
    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    @Basic
    @Column(name = "Ctime_bak", nullable = true)
    public Timestamp getCtimeBak() {
        return ctimeBak;
    }

    public void setCtimeBak(Timestamp ctimeBak) {
        this.ctimeBak = ctimeBak;
    }

    @Basic
    @Column(name = "Source", nullable = true)
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Basic
    @Column(name = "Equipment", nullable = true)
    public Integer getEquipment() {
        return equipment;
    }

    public void setEquipment(Integer equipment) {
        this.equipment = equipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrmdetailEntity that = (CrmdetailEntity) o;
        return Objects.equals(bcid, that.bcid) &&
                Objects.equals(address, that.address) &&
                Objects.equals(name, that.name) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(sign, that.sign) &&
                Objects.equals(ctime, that.ctime) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(area, that.area) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(utime, that.utime) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(card, that.card) &&
                Objects.equals(otherinfo, that.otherinfo) &&
                Objects.equals(unitaddress, that.unitaddress) &&
                Objects.equals(jwpassport, that.jwpassport) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(custype, that.custype) &&
                Objects.equals(cuslevel, that.cuslevel) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(buyplan, that.buyplan) &&
                Objects.equals(firstdemand, that.firstdemand) &&
                Objects.equals(intentionbuild, that.intentionbuild) &&
                Objects.equals(intentionarea, that.intentionarea) &&
                Objects.equals(intentionfamily, that.intentionfamily) &&
                Objects.equals(intentionproperty, that.intentionproperty) &&
                Objects.equals(intentiondegrees, that.intentiondegrees) &&
                Objects.equals(intentionsize, that.intentionsize) &&
                Objects.equals(intentionprice, that.intentionprice) &&
                Objects.equals(buildingtype, that.buildingtype) &&
                Objects.equals(traffic, that.traffic) &&
                Objects.equals(supporting, that.supporting) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(demandremark, that.demandremark) &&
                Objects.equals(cusremark, that.cusremark) &&
                Objects.equals(zstatus, that.zstatus) &&
                Objects.equals(istrad, that.istrad) &&
                Objects.equals(istradtime, that.istradtime) &&
                Objects.equals(citys, that.citys) &&
                Objects.equals(followed, that.followed) &&
                Objects.equals(isnext, that.isnext) &&
                Objects.equals(nexttime, that.nexttime) &&
                Objects.equals(followedname, that.followedname) &&
                Objects.equals(cusNeeds, that.cusNeeds) &&
                Objects.equals(needremark, that.needremark) &&
                Objects.equals(downremark, that.downremark) &&
                Objects.equals(uname, that.uname) &&
                Objects.equals(fields1, that.fields1) &&
                Objects.equals(fields2, that.fields2) &&
                Objects.equals(fields3, that.fields3) &&
                Objects.equals(followstatus, that.followstatus) &&
                Objects.equals(type, that.type) &&
                Objects.equals(isorder, that.isorder) &&
                Objects.equals(intentionAreaId, that.intentionAreaId) &&
                Objects.equals(intentionDid, that.intentionDid) &&
                Objects.equals(intentionDname, that.intentionDname) &&
                Objects.equals(disId, that.disId) &&
                Objects.equals(disName, that.disName) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(signTime, that.signTime) &&
                Objects.equals(followTime, that.followTime) &&
                Objects.equals(cid, that.cid) &&
                Objects.equals(cname, that.cname) &&
                Objects.equals(plan, that.plan) &&
                Objects.equals(bcidStr, that.bcidStr) &&
                Objects.equals(jiwuid, that.jiwuid) &&
                Objects.equals(timeage, that.timeage) &&
                Objects.equals(timeday, that.timeday) &&
                Objects.equals(timenum, that.timenum) &&
                Objects.equals(mobileLink, that.mobileLink) &&
                Objects.equals(timesign, that.timesign) &&
                Objects.equals(ispay, that.ispay) &&
                Objects.equals(rechip, that.rechip) &&
                Objects.equals(refund, that.refund) &&
                Objects.equals(ctimeBak, that.ctimeBak) &&
                Objects.equals(source, that.source) &&
                Objects.equals(equipment, that.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcid, address, name, unit, uid, sign, ctime, sex, email, mobile, area, tel, utime, qq, card, otherinfo, unitaddress, jwpassport, birthday, custype, cuslevel, purpose, buyplan, firstdemand, intentionbuild, intentionarea, intentionfamily, intentionproperty, intentiondegrees, intentionsize, intentionprice, buildingtype, traffic, supporting, brand, demandremark, cusremark, zstatus, istrad, istradtime, citys, followed, isnext, nexttime, followedname, cusNeeds, needremark, downremark, uname, fields1, fields2, fields3, followstatus, type, isorder, intentionAreaId, intentionDid, intentionDname, disId, disName, areaId, signTime, followTime, cid, cname, plan, bcidStr, jiwuid, timeage, timeday, timenum, mobileLink, timesign, ispay, rechip, refund, ctimeBak, source, equipment);
    }
}
