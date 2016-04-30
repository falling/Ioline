package zucc.edu.cn.Bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by Joeg on 2016/4/25.
 */
@DatabaseTable(tableName = "tb_user")
public class User {
    //    id       user_id    pwd    state       time       remark
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "user_id")
    private String user_id;
    @DatabaseField(columnName = "pwd")
    private String pwd;
    @DatabaseField(columnName = "state")
    private int state;
    @DatabaseField(columnName = "time")
    private Date time;
    @DatabaseField(columnName = "remark")
    private String remark;


    public User() {
    }

    public User(String remark, Date time, int state, String pwd, String user_id) {
        this.remark = remark;
        this.time = time;
        this.state = state;
        this.pwd = pwd;
        this.user_id = user_id;
    }


    public int getId() {
        return id;
    }public void setId(int id) {
        this.id = id;
    }public String getUser_id() {
        return user_id;
    }public void setUser_id(String user_id) {
        this.user_id = user_id;
    }public String getPwd() {
        return pwd;
    }public void setPwd(String pwd) {
        this.pwd = pwd;
    }public int getState() {
        return state;
    }public void setState(int state) {
        this.state = state;
    }public Date getTime() {
        return time;
    }public void setTime(Date time) {
        this.time = time;
    }public String getRemark() {
        return remark;
    }public void setRemark(String remark) {
        this.remark = remark;
    }

}
