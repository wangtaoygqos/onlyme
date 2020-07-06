import java.lang.annotation.*;

/**
 * @author wangtao
 * @ClassName EagleEye
 * @date 2020/7/6 10:40
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EagleEye {
    /**
     * 接口描述
     * @return
     */
    String desc() default "";
}
