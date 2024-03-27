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
package com.iohao.game.action.skeleton.pulse.core.producer;

import java.io.Serializable;

/**
 * 脉冲生产者
 * <pre>
 *     主要职责是：
 *     1 生产脉冲信号请求
 *     2 周期性的触发一个生产请求
 * </pre>
 *
 * @author 渔民小镇
 * @date 2023-04-20
 */
public interface PulseProducer<T extends Serializable> extends
        PulseSignalResponseAccept<T>,
        PulseCreatePeriod,
        PulseCreateRequest {

}
