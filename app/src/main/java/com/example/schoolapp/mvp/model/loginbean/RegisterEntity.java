package com.example.schoolapp.mvp.model.loginbean;

public class RegisterEntity {


    /**
     * code : code=200 请求正常，其他异常
     * data : {"age":0,"balance":0,"creator":"string","depart":"string","departId":0,"editor":"string","email":"string","id":0,"invitationCode":"string","phone":"string","region":"string","regionId":0,"schoolId":0,"schoolName":"string","sex":0,"status":0,"type":0,"userName":"李敏","userNick":"string","vipScores":0}
     * msg : 请求成功|删除成功|新增成功|请求失败等等
     * token : 用户token
     */

    private int code;
    /**
     * age : 0
     * balance : 0
     * creator : string
     * depart : string
     * departId : 0
     * editor : string
     * email : string
     * id : 0
     * invitationCode : string
     * phone : string
     * region : string
     * regionId : 0
     * schoolId : 0
     * schoolName : string
     * sex : 0
     * status : 0
     * type : 0
     * userName : 李敏
     * userNick : string
     * vipScores : 0
     */

    private DataBean data;
    private String msg;
    private String token;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class DataBean {
        private int age;
        private int balance;
        private String creator;
        private String depart;
        private int departId;
        private String editor;
        private String email;
        private int id;
        private String invitationCode;
        private String phone;
        private String region;
        private int regionId;
        private int schoolId;
        private String schoolName;
        private int sex;
        private int status;
        private int type;
        private String userName;
        private String userNick;
        private int vipScores;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getDepart() {
            return depart;
        }

        public void setDepart(String depart) {
            this.depart = depart;
        }

        public int getDepartId() {
            return departId;
        }

        public void setDepartId(int departId) {
            this.departId = departId;
        }

        public String getEditor() {
            return editor;
        }

        public void setEditor(String editor) {
            this.editor = editor;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getInvitationCode() {
            return invitationCode;
        }

        public void setInvitationCode(String invitationCode) {
            this.invitationCode = invitationCode;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getRegionId() {
            return regionId;
        }

        public void setRegionId(int regionId) {
            this.regionId = regionId;
        }

        public int getSchoolId() {
            return schoolId;
        }

        public void setSchoolId(int schoolId) {
            this.schoolId = schoolId;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserNick() {
            return userNick;
        }

        public void setUserNick(String userNick) {
            this.userNick = userNick;
        }

        public int getVipScores() {
            return vipScores;
        }

        public void setVipScores(int vipScores) {
            this.vipScores = vipScores;
        }
    }
}
