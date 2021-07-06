package main.block02.lesson14;

import java.lang.reflect.*;
import java.math.BigDecimal;

public class ProxyRunner {

    public static void main(String[] args) throws Exception {

        System.out.println("Работа со счетом физического лица");
        PhysicalScore scoreF = new PhysicalScore("Pavel");
        Score proxyF = (Score) Proxy.newProxyInstance(ProxyRunner.class.getClassLoader(), new Class[]{Score.class},
                new ScoreInvocationHandler(scoreF));
        System.out.println(proxyF);
        proxyF.topUp(BigDecimal.valueOf(555));
        proxyF.withdrawals(BigDecimal.valueOf(5555));
        System.out.println("------------------------------------------------------------");
        System.out.println("Работа со счетом юридического лица");
        LegalPersonScore scoreL = new LegalPersonScore("OOO");
        Score proxyL = (Score) Proxy.newProxyInstance(ProxyRunner.class.getClassLoader(), new Class[]{Score.class},
                new ScoreInvocationHandler(scoreL));
        System.out.println(proxyL);
        proxyL.topUp(BigDecimal.valueOf(555));
        proxyL.withdrawals(BigDecimal.valueOf(5555));
    }
}