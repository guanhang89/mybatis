package com.guanhang.service;

import com.guanhang.dao.DatabaseOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//使用注解
@Component("AnnoService")
public class Myservice3 {

    @Autowired
    @Qualifier("operateTableTwoImpl")
    //@Repository、@Service、@Controller 和 @Component
    private DatabaseOperate operate;

    public void insert(Object o) {
        operate.insert(null);
    }

    public DatabaseOperate getOperate() {
        return operate;
    }

    public void setOperate(DatabaseOperate operate) {
        this.operate = operate;
    }
}
