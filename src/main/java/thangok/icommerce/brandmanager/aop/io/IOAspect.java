package thangok.icommerce.brandmanager.aop.io;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IOAspect {
    @Around("@annotation(LogIO)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StringBuilder sb = new StringBuilder();
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            sb.append(arg).append(",");
        }
        if (args.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(")");

        System.out.println(sb);

        return joinPoint.proceed();
    }
}
