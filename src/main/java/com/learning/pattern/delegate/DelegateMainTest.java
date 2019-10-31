package com.learning.pattern.delegate;

import org.junit.jupiter.api.Test;

/**
 * @author: dengxin.chen
 * @date: 2019-10-31 18:28
 * @description:
 */
public class DelegateMainTest {

    /**
     * 简单委派模式测试，负责任务的调度和分配，注重结果
     */
    @Test
    public void simpleDeleageTest() {
        Leader leader = new Leader();
        leader.doing("前端");
    }
}
