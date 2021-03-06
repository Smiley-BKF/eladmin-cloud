package org.micah.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @program: eladmin-cloud
 * @description:
 * @author: Micah
 * @create: 2020-08-12 14:47
 **/
@Setter
@Getter
@TableName("sys_users_jobs")
public class UserJobRelation extends Model<UserJobRelation> implements Serializable {

    private static final long serialVersionUID = 6302335955493076994L;

    private Long userId;

    private Long jobId;

    public UserJobRelation(Long userId, Long jobId) {
        this.userId = userId;
        this.jobId = jobId;
    }

    public UserJobRelation() {
    }
}
