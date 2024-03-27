/*
 * ioGame
 * Copyright (C) 2021 - present  渔民小镇 （262610965@qq.com、luoyizhu@gmail.com） . All Rights Reserved.
 * # iohao.com . 渔民小镇
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.iohao.game.action.skeleton.annotation;

import java.lang.annotation.*;

/**
 * 文档相关
 * <pre>
 *     仅用于推送文档生成
 * </pre>
 *
 * @author 渔民小镇
 * @date 2022-01-31
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(DocActionSends.class)
public @interface DocActionSend {
    /** 主路由 */
    int cmd();

    /** 子路由 */
    int subCmd();

    /** 业务对象class */
    Class<?> dataClass();

    /** 推送描述 */
    String description() default "";
}
