/*
* Copyright 2020-2025 Micah
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.micah.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
* @description /
* @author Micah
* @date 2020-09-03
**/
@Data
@TableName("mnt_deploy_server")
@AllArgsConstructor
@NoArgsConstructor
public class DeployServerRelation implements Serializable {

    private static final long serialVersionUID = 1L;


        @ApiModelProperty(value = "部署ID")
        private Long deployId;


        @ApiModelProperty(value = "服务ID")
        private Long serverId;
}
