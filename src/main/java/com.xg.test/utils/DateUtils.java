package src.main.java.com.xg.test.utils;


import java.util.Date;

/**
 * Created by Administrator on 2018-04-07.
 */
public class DateUtils {
    /**
     * 获取十位时间戳
     * @return
     */
    public Long getTime(){
        return new Date().getTime()/1000;
    }
}
