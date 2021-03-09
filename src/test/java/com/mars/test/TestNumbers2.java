package testDemo;

public class TestNumbers2 {
    public static void main(String[] args) {
//        doTest();
        doTest2();
    }

    /**
     * 求0-7组成的奇数个数
     */
    public static void doTest() {
        int count=0;
        for (int i = 1; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k <8 ; k++) {
                    for (int l = 0; l <8 ; l++) {
                        for (int m = 0; m <8 ; m++) {
                            for (int n = 0; n <8 ; n++) {
                                for (int o = 0; o <8 ; o++) {
                                    for (int p = 1; p < 8; p=p+2) {
                                        if ((i*10000000+j*1000000+k*100000+l*10000+m*1000+n*100+o*10+p)%2!=0) {
                                            if (i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&i!=o&&i!=p) {
                                                if (i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&i!=o&&i!=p){
                                                    if (k!=l&&k!=m&&k!=n&&k!=o&&k!=p) {
                                                        if (l!=m&&l!=n&&l!=o&&l!=p) {
                                                            if (m!=n&&m!=o&&m!=p) {
                                                                if (n!=o&&n!=p) {
                                                                    if (o!=p) {

                                                                        count++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void doTest2() {
        int count=0;
        for (int i = 10000000; i <100000000 ; i++) {
            if ((i+"").indexOf(8)==-1||(i+"").indexOf(9)==-1) {
                if (i%2 !=0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
