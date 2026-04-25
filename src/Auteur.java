package LibraFlow.src;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Auteur {
    String nom();

    String date() default "inconnue";
}
