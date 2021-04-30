package com.example.schoolapp.mvp.model.loginbean;

public class LoginSuccessEntity {


    /**
     * code : 200
     * token : 86e27255cc764b7bb3b2411defacae52
     * msg : 登录成功
     * data : {"editor":null,"editTime":"2021-03-17 20:37:04","creator":null,"createTime":"2021-03-17 20:37:04","status":1,"id":6,"userName":"test2","age":null,"sex":null,"phone":"17611116706","email":"2@qq.com","userNick":null,"regionId":null,"region":null,"departId":null,"depart":null,"vipScores":null,"balance":null,"invitationCode":null,"type":1,"schoolId":null,"schoolName":null}
     */

    private int code;
    private String token;
    private String msg;
    /**
     * editor : null
     * editTime : 2021-03-17 20:37:04
     * creator : null
     * createTime : 2021-03-17 20:37:04
     * status : 1
     * id : 6
     * userName : test2
     * age : null
     * sex : null
     * phone : 17611116706
     * email : 2@qq.com
     * userNick : null
     * regionId : null
     * region : null
     * departId : null
     * depart : null
     * vipScores : null
     * balance : null
     * invitationCode : null
     * type : 1
     * schoolId : null
     * schoolName : null
     */

    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String editor;
        private String editTime;
        private String creator;
        private String createTime;
        private int status;
        private int id;
        private String userName;
        private String age;
        private String sex;
        private String phone;
        private String email;
        private String userNick;
        private String regionId;
        private String region;
        private String departId;
        private String depart;
        private String vipScores;
        private String balance;
        private String invitationCode;
        private int type;
        private String schoolId;
        private String schoolName;

        public String getEditor() {
            return editor;
        }

        public void setEditor(String editor) {
            this.editor = editor;
        }

        public String getEditTime() {
            return editTime;
        }

        public void setEditTime(String editTime) {
            this.editTime = editTime;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserNick() {
            return userNick;
        }

        public void setUserNick(String userNick) {
            this.userNick = userNick;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getDepartId() {
            return departId;
        }

        public void setDepartId(String departId) {
            this.departId = departId;
        }

        public String getDepart() {
            return depart;
        }

        public void setDepart(String depart) {
            this.depart = depart;
        }

        public String getVipScores() {
            return vipScores;
        }

        public void setVipScores(String vipScores) {
            this.vipScores = vipScores;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getInvitationCode() {
            return invitationCode;
        }

        public void setInvitationCode(String invitationCode) {
            this.invitationCode = invitationCode;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSchoolId() {
            return schoolId;
        }

        public void setSchoolId(String schoolId) {
            this.schoolId = schoolId;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }
    }
}
