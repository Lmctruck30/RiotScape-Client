import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.GregorianCalendar;

@SuppressWarnings("serial")
public final class client extends GameApplet {

   static Class130 aClass130_2194 = new Class130(16);
   static int anInt2195;
   private static Class94 aClass94_2198 = Class3_Sub4.buildString("cyan:");
   static Class94 aClass94_2196 = aClass94_2198;
   static Class94 aClass94_2197 = aClass94_2198;
   static Class3_Sub11[][] aClass3_Sub11ArrayArray2199;
   static int[] anIntArray2200;
   public static boolean aBoolean2201;
   static final BigInteger RSA_MODULUS = new BigInteger("8681728765774586264826034111136556168508342358174855667416673089541534843619631105762049851963637817301215107270082267498686397610627688294575108112949139");
   static final BigInteger RSA_PUBLIC_KEY = new BigInteger("65537");


   final void method38(int var1) {
      try {
         if(~Class143.anInt1875 != -1001) {
            boolean var2 = Class140_Sub4_Sub2.method1988(false);
            if(var2 && Class83.aBoolean1158 && Class44_Sub1.aClass155_2627 != null) {
               Class44_Sub1.aClass155_2627.method2158((byte)-78);
            }

            if((-31 == ~Class143.anInt1875 || -11 == ~Class143.anInt1875) && (Class3_Sub28_Sub5.aBoolean3593 || ~Class53.aLong866 != -1L && Class53.aLong866 < Class5.method830((byte)-55))) {
               Class140.method1862(Class3_Sub28_Sub5.aBoolean3593, Class83.method1411(0), -8914, Class3_Sub13.anInt2378, Class3_Sub13_Sub5.anInt3071);
            }

            int var4;
            int var5;
            if(null == Class3_Sub13_Sub10.aFrame3121) {
               Object var3;
               if(Class3_Sub13_Sub10.aFrame3121 != null) {
                  var3 = Class3_Sub13_Sub10.aFrame3121;
               } else if(Class3_Sub13_Sub7.aFrame3092 != null) {
                  var3 = Class3_Sub13_Sub7.aFrame3092;
               } else {
                  var3 = Class38.aClass87_665.gameApplet;
               }

               var4 = ((Container)var3).getSize().width;
               var5 = ((Container)var3).getSize().height;
               if(var3 == Class3_Sub13_Sub7.aFrame3092) {
                  Insets var6 = Class3_Sub13_Sub7.aFrame3092.getInsets();
                  var4 -= var6.right + var6.left;
                  var5 -= var6.top + var6.bottom;
               }

               if(var4 != Class3_Sub9.anInt2334 || ~var5 != ~Class70.anInt1047) {
                  if(Class87.operatingSystemNameLowerCase.startsWith("mac")) {
                     Class3_Sub9.anInt2334 = var4;
                     Class70.anInt1047 = var5;
                  } else {
                     Class119.method1729(true);
                  }

                  Class53.aLong866 = Class5.method830((byte)-55) - -500L;
               }
            }

            if(Class3_Sub13_Sub10.aFrame3121 != null && !Class3_Sub13_Sub6.aBoolean3078 && (30 == Class143.anInt1875 || 10 == Class143.anInt1875)) {
               Class140.method1862(false, Class3_Sub28.anInt2577, -8914, -1, -1);
            }

            if(var1 != 40) {
               method44((Class11)null);
            }

            boolean var10 = false;
            if(Class3_Sub13_Sub10.aBoolean3116) {
               var10 = true;
               Class3_Sub13_Sub10.aBoolean3116 = false;
            }

            if(var10) {
               Class80.method1396(var1 ^ -41);
            }

            if(Class138.aBoolean1807) {
               for(var4 = 0; ~var4 > -101; ++var4) {
                  Class3_Sub28_Sub14.aBooleanArray3674[var4] = true;
               }
            }

            if(~Class143.anInt1875 == -1) {
               Class3_Sub28_Sub1.method533((Color)null, false, var10, Class3_Sub17.aClass94_2464, Class3_Sub28_Sub15.anInt3684);
            } else if(5 == Class143.anInt1875) {
               Class3_Sub23.method406((byte)117, false, Class168.aClass3_Sub28_Sub17_2096);
            } else if(-11 != ~Class143.anInt1875) {
               if(25 != Class143.anInt1875 && -29 != ~Class143.anInt1875) {
                  if(Class143.anInt1875 == 30) {
                     Class49.method1127(var1 + -40);
                  } else if(40 == Class143.anInt1875) {
                     Class3_Sub13.method164((byte)-95, false, Class16.method903(new Class94[]{Class136.aClass94_1773, Class3_Sub30.aClass94_2598, Class154.aClass94_1959}, (byte)-67));
                  }
               } else if(~Class163_Sub2_Sub1.anInt4019 != -2) {
                  if(Class163_Sub2_Sub1.anInt4019 == 2) {
                     if(Class3_Sub5.anInt2275 < Class162.anInt2038) {
                        Class3_Sub5.anInt2275 = Class162.anInt2038;
                     }

                     var4 = (-Class162.anInt2038 + Class3_Sub5.anInt2275) * 50 / Class3_Sub5.anInt2275 + 50;
                     Class3_Sub13.method164((byte)-41, false, Class16.method903(new Class94[]{Class3_Sub13_Sub23.aClass94_3282, Class3_Sub13_Sub33.aClass94_3399, Class72.method1298((byte)9, var4), Class10.aClass94_148}, (byte)-68));
                  } else {
                     Class3_Sub13.method164((byte)-73, false, Class3_Sub13_Sub23.aClass94_3282);
                  }
               } else {
                  if(~Class3_Sub29.anInt2579 > ~Class3_Sub13_Sub24.anInt3293) {
                     Class3_Sub29.anInt2579 = Class3_Sub13_Sub24.anInt3293;
                  }

                  var4 = 50 * (Class3_Sub29.anInt2579 + -Class3_Sub13_Sub24.anInt3293) / Class3_Sub29.anInt2579;
                  Class3_Sub13.method164((byte)-71, false, Class16.method903(new Class94[]{Class3_Sub13_Sub23.aClass94_3282, Class3_Sub13_Sub33.aClass94_3399, Class72.method1298((byte)9, var4), Class10.aClass94_148}, (byte)-62));
               }
            } else {
               Class3_Sub17.method381(true);
            }

            if(Class138.aBoolean1807 && -1 != ~Class143.anInt1875) {
               Class138.method1826();

               for(var4 = 0; ~var4 > ~Class3_Sub28_Sub3.anInt3557; ++var4) {
                  Class163_Sub1_Sub1.aBooleanArray4008[var4] = false;
               }
            } else {
               Graphics var11;
               if((~Class143.anInt1875 == -31 || 10 == Class143.anInt1875) && ~Class3_Sub28_Sub15.anInt3689 == -1 && !var10) {
                  try {
                     var11 = Class3_Sub28_Sub12.aCanvas3648.getGraphics();

                     for(var5 = 0; Class3_Sub28_Sub3.anInt3557 > var5; ++var5) {
                        if(Class163_Sub1_Sub1.aBooleanArray4008[var5]) {
                           Class164_Sub1.aClass158_3009.method2184(Class3_Sub28_Sub18.anIntArray3768[var5], Class155.anIntArray1969[var5], 6260, Class140_Sub4.anIntArray2794[var5], var11, Class140_Sub4_Sub1.anIntArray3954[var5]);
                           Class163_Sub1_Sub1.aBooleanArray4008[var5] = false;
                        }
                     }
                  } catch (Exception var8) {
                     Class3_Sub28_Sub12.aCanvas3648.repaint();
                  }
               } else if(0 != Class143.anInt1875) {
                  try {
                     var11 = Class3_Sub28_Sub12.aCanvas3648.getGraphics();
                     Class164_Sub1.aClass158_3009.method2179(0, 0, var11, 0);

                     for(var5 = 0; var5 < Class3_Sub28_Sub3.anInt3557; ++var5) {
                        Class163_Sub1_Sub1.aBooleanArray4008[var5] = false;
                     }
                  } catch (Exception var7) {
                     Class3_Sub28_Sub12.aCanvas3648.repaint();
                  }
               }
            }

            if(Class58.aBoolean913) {
               Class75_Sub3.method1346(26211);
            }

            if(Class94.aBoolean2146 && 10 == Class143.anInt1875 && 0 != ~Class3_Sub28_Sub12.anInt3655) {
               Class94.aBoolean2146 = false;
               Class119.method1730(Class38.aClass87_665, (byte)14);
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "client.K(" + var1 + ')');
      }
   }

   static final Class11 method42(Class11 var0) {
      int var1 = method44(var0).method94((byte)-74);
      if(var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            var0 = Class7.method832((byte)127, var0.anInt190);
            if(var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   public static void method43(boolean var0) {
      try {
         if(!var0) {
            aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])((Class3_Sub11[][])null);
         }

         anIntArray2200 = null;
         aClass94_2196 = null;
         aClass94_2198 = null;
         aClass130_2194 = null;
         aClass94_2197 = null;
         aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "client.O(" + var0 + ')');
      }
   }

   final void method32(byte var1) {
      try {
         if(Class138.aBoolean1807) {
            Class138.method1842();
         }

         if(null != Class3_Sub13_Sub10.aFrame3121) {
            Class3_Sub28_Sub10_Sub1.method593(Class3_Sub13_Sub10.aFrame3121, true, Class38.aClass87_665);
            Class3_Sub13_Sub10.aFrame3121 = null;
         }

         if(null != Class38.aClass87_665) {
            Class38.aClass87_665.method1442(this.getClass(), 0);
         }

         if(null != Class106.aClass67_1443) {
            Class106.aClass67_1443.aBoolean1015 = false;
         }

         Class106.aClass67_1443 = null;
         if(Class3_Sub15.aClass89_2429 != null) {
            Class3_Sub15.aClass89_2429.method1468(14821);
            Class3_Sub15.aClass89_2429 = null;
         }

         Class163_Sub1_Sub1.method2215(Class3_Sub28_Sub12.aCanvas3648, -9320);
         Class130.method1783(4, Class3_Sub28_Sub12.aCanvas3648);
         if(null != Class38.aClass146_668) {
            Class38.aClass146_668.method2082(false, Class3_Sub28_Sub12.aCanvas3648);
         }

         Class3_Sub13_Sub1.method167(0);
         Class149.method2090(8);
         Class38.aClass146_668 = null;
         if(null != Class44_Sub1.aClass155_2627) {
            Class44_Sub1.aClass155_2627.method2163(false);
         }

         if(null != Class3_Sub21.aClass155_2491) {
            Class3_Sub21.aClass155_2491.method2163(false);
         }

         Class58.aClass66_917.method1254(false);
         Class3_Sub13_Sub14.aClass73_3159.method1304(3208);

         try {
            if(Class101.aClass30_1422 != null) {
               Class101.aClass30_1422.method980(false);
            }

            if(var1 <= 20) {
               return;
            }

            if(Class163_Sub2.aClass30Array2998 != null) {
               for(int var2 = 0; var2 < Class163_Sub2.aClass30Array2998.length; ++var2) {
                  if(null != Class163_Sub2.aClass30Array2998[var2]) {
                     Class163_Sub2.aClass30Array2998[var2].method980(false);
                  }
               }
            }

            if(null != Class114.aClass30_1572) {
               Class114.aClass30_1572.method980(false);
            }

            if(null != Class69.aClass30_1039) {
               Class69.aClass30_1039.method980(false);
            }
         } catch (IOException var3) {
            ;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.F(" + var1 + ')');
      }
   }

   public final void init() {
      try {
         if(this.hostNameCheck(27496)) {
            Class111.worldId = Integer.parseInt(this.getParameter("worldid"));
            Class44.anInt718 = Integer.parseInt(this.getParameter("modewhere"));
            if(0 > Class44.anInt718 || 1 < Class44.anInt718) {
               Class44.anInt718 = 0;
            }

            Class3_Sub13_Sub13.clientMode = Integer.parseInt(this.getParameter("modewhat"));
            if(~Class3_Sub13_Sub13.clientMode > -1 || Class3_Sub13_Sub13.clientMode > 2) {
               Class3_Sub13_Sub13.clientMode = 0;
            }

            String var1 = this.getParameter("advertsuppressed");
            if(var1 != null && var1.equals("1")) {
               Class3_Sub28_Sub19.aBoolean3779 = true;
            } else {
               Class3_Sub28_Sub19.aBoolean3779 = false;
            }

            try {
               Class3_Sub20.clientLanguage = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception var10) {
               Class3_Sub20.clientLanguage = 0;
            }

            Class3.method87(-31, Class3_Sub20.clientLanguage);
            String var2 = this.getParameter("objecttag");
            if(var2 != null && var2.equals("1")) {
               Class163_Sub2_Sub1.aBoolean4018 = true;
            } else {
               Class163_Sub2_Sub1.aBoolean4018 = false;
            }

            String var3 = this.getParameter("js");
            if(null != var3 && var3.equals("1")) {
               Class3_Sub28_Sub11.aBoolean3641 = true;
            } else {
               Class3_Sub28_Sub11.aBoolean3641 = false;
            }

            String var4 = this.getParameter("game");
            if(var4 != null && var4.equals("1")) {
               Class158.clientGameType = 1;
            } else {
               Class158.clientGameType = 0;
            }

            try {
               Class3_Sub26.anInt2554 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception var9) {
               Class3_Sub26.anInt2554 = 0;
            }

            Class163_Sub2.aClass94_2996 = Class133.aClass94_1745.method1573((byte)126, this);
            if(Class163_Sub2.aClass94_2996 == null) {
               Class163_Sub2.aClass94_2996 = Class3_Sub28_Sub14.aClass94_3672;
            }

            String var5 = this.getParameter("country");
            if(var5 != null) {
               try {
                  Class3_Sub31.anInt2607 = Integer.parseInt(var5);
               } catch (Exception var8) {
                  Class3_Sub31.anInt2607 = 0;
               }
            }

            String var6 = this.getParameter("haveie6");
            if(null != var6 && var6.equals("1")) {
               Class106.aBoolean1451 = true;
            } else {
               Class106.aBoolean1451 = false;
            }

            Class126.aClient1671 = this;
            this.method41((byte)-56, 765, 32 - -Class3_Sub13_Sub13.clientMode, 1530, 503);
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "client.init()");
      }
   }

   final void method39(int var1) {
      try {
         Class119.method1729(true);
         Class3_Sub13_Sub14.aClass73_3159 = new Class73();
         Class58.aClass66_917 = new Class66();
         if(Class3_Sub13_Sub13.clientMode != 0) {
            Class3_Sub6.aByteArrayArray2287 = new byte[50][];
         }

	Class3_Sub16.anInt2451 = Class111.worldId;
         Class3_Sub28_Sub7.method564(Class38.aClass87_665, 0);
         if(Class44.anInt718 != 0) {
            if(Class44.anInt718 == 1) {
               RuntimeException_Sub1.aString2121 = this.getCodeBase().getHost();
               Class53.anInt867 = Class111.worldId + 50000;
               Class3_Sub28_Sub19.anInt3773 = 40000 + Class111.worldId;
            } else if(Class44.anInt718 == 2) {
               RuntimeException_Sub1.aString2121 = "127.0.0.1";
               Class53.anInt867 = Class111.worldId + '\uc350';
               Class3_Sub28_Sub19.anInt3773 = Class111.worldId + '\u9c40';
            }
         } else {
            RuntimeException_Sub1.aString2121 = this.getCodeBase().getHost();
            Class53.anInt867 = 443;
            Class3_Sub28_Sub19.anInt3773 = '\uaa4a';
         }

         if(1 != Class158.clientGameType) {
            Class15.aShortArrayArray344 = Class3_Sub28_Sub12.aShortArrayArray3654;
            Class91.aShortArray1311 = Class3_Sub13_Sub28.aShortArray3349;
            Class101.aShortArrayArray1429 = Class20.aShortArrayArray435;
            Class3_Sub25.aShortArray2548 = Class164_Sub1.aShortArray3011;
         } else {
            Class101.aBoolean1419 = true;
            Class92.anInt1322 = 16777215;
            Class92.anInt1316 = 0;
            Class15.aShortArrayArray344 = Class118.aShortArrayArray1619;
            Class101.aShortArrayArray1429 = Class75_Sub1.aShortArrayArray2634;
            Class3_Sub25.aShortArray2548 = Class2.aShortArray63;
            Class91.aShortArray1311 = Class3_Sub2.aShortArray2219;
         }

         Class26.anInt506 = Class53.anInt867;
         Class162.anInt2036 = Class3_Sub28_Sub19.anInt3773;
         Class38_Sub1.aString2611 = RuntimeException_Sub1.aString2121;
         Class123.anInt1658 = Class3_Sub28_Sub19.anInt3773;
         Class3_Sub13_Sub38.aShortArray3455 = Class3_Sub13_Sub9.aShortArray3110 = Class136.aShortArray1779 = Class3_Sub13_Sub38.aShortArray3453 = new short[256];
         if(var1 != 2) {
            method51((Class11)null);
         }

         Class140_Sub6.anInt2894 = Class123.anInt1658;
         if(Class87.anInt1214 == 3 && 2 != Class44.anInt718) {
            Class3_Sub16.anInt2451 = Class111.worldId;
         }

         Class3_Sub22.method402(74);
         Class3_Sub13_Sub4.method193((byte)115, Class3_Sub28_Sub12.aCanvas3648);
         Class48.method1119(Class3_Sub28_Sub12.aCanvas3648, false);
         Class38.aClass146_668 = Class21.method916((byte)15);
         if(null != Class38.aClass146_668) {
            Class38.aClass146_668.method2084(Class3_Sub28_Sub12.aCanvas3648, -97);
         }

         Class163_Sub1.anInt2994 = Class87.anInt1214;

         try {
            if(Class38.aClass87_665.mainFileCache2File != null) {
               Class101.aClass30_1422 = new Class30(Class38.aClass87_665.mainFileCache2File, 5200, 0);

               for(int var2 = 0; ~var2 > -29; ++var2) {
                  Class163_Sub2.aClass30Array2998[var2] = new Class30(Class38.aClass87_665.mainFileCacheIdxArray[var2], 6000, 0);
               }

               Class114.aClass30_1572 = new Class30(Class38.aClass87_665.mainFileCacheIdx255File, 6000, 0);
               Class86.aClass41_1186 = new Class41(255, Class101.aClass30_1422, Class114.aClass30_1572, 500000);
               Class69.aClass30_1039 = new Class30(Class38.aClass87_665.randomDataFile, 24, 0);
               Class38.aClass87_665.mainFileCacheIdxArray = null;
               Class38.aClass87_665.mainFileCacheIdx255File = null;
               Class38.aClass87_665.randomDataFile = null;
               Class38.aClass87_665.mainFileCache2File = null;
            }
         } catch (IOException var3) {
            Class69.aClass30_1039 = null;
            Class101.aClass30_1422 = null;
            Class114.aClass30_1572 = null;
            Class86.aClass41_1186 = null;
         }

         Class167.aClass94_2083 = Class25.aClass94_485;
         if(~Class44.anInt718 != -1) {
            Class20.aBoolean438 = true;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.B(" + var1 + ')');
      }
   }

   final void method33(int var1) {
      try {
         method43(true);
         Class94.method1541(-8635);
         Class38.method1024(21474);
         Class3_Sub28_Sub3.method542((byte)-46);
         Class131.method1792(0);
         GameApplet.method26(113);
         Class138.method1838();
         Class129.method1766(24241);
         Class158.method2181(false);
         Class67.method1257(25951);
         Class96.method1588((byte)106);
         Class3_Sub30.method767(0);
         Class89.method1463(0);
         Class66.method1242((byte)-88);
         Class73.method1306(-16222);
         Class8.method836(-114);
         Class151_Sub1.method2105(false);
         Class153.method2119(100);
         Class30.method974(true);
         Class41.method1049(true);
         Class93.method1521(3101);
         Class140_Sub4_Sub2.method1983(-3);
         Class3_Sub30_Sub1.method808(1);
         Class91.method1491((byte)-124);
         Class11.method860(126);
         Class106.method1644((byte)121);
         Class140_Sub4_Sub1.method1982((byte)121);
         Class61.method1217(0);
         Class3_Sub28_Sub16.method634((byte)108);
         Class130.method1774(103);
         Class146.method2081(0);
         Class3_Sub19.method387(103);
         Class133.method1802(25);
         Class3_Sub24_Sub4.method491((byte)85);
         Class155.method2165(0);
         Class157.method2175((byte)-110);
         Class52.method1168(8160);
         Class142.method2057((byte)-108);
         Class140_Sub4.method1974((byte)-116);
         Class3_Sub2.method102(3353893);
         Class111.method1687(-11);
         Class3_Sub4.method109(2);
         Class90.method1473((byte)103);
         Class3_Sub31.method821(26971);
         Class3_Sub1.method91((byte)120);
         Class3.method83((byte)30);
         Class13.method875((byte)106);
         Class63.method1231(119);
         Class95.method1582(3);
         Class3_Sub28_Sub5.method558(-29679);
         Class145.method2071((byte)59);
         Class46.method1085(-1);
         Class132.method1800((byte)104);
         Class14.method886((byte)35);
         Class119.method1728(-14256);
         Class127.method1754(-79);
         Class17.method905(-24912);
         Class128.method1761((byte)-55);
         RuntimeException_Sub1.method2288(false);
         Class20.method908(5157);
         Class167.method2262((byte)126);
         Class3_Sub28_Sub10_Sub1.method592((byte)38);
         Class3_Sub28_Sub10_Sub2.method597((byte)108);
         Class99.method1598(-126);
         Class84.method1422((byte)24);
         Class92.method1507();
         Class40.method1042(true);
         Class140_Sub5.method1990();
         Class136.method1815((byte)-45);
         Class140_Sub1_Sub1.method1915();
         Class48.method1111(3327);
         Class140_Sub1_Sub2.method1948();
         Class148.method2085(118);
         Class149.method2088(true);
         Class23.method937(0);
         Class83.method1414(90);
         Class31.method987();
         Class15.method892(100);
         Canvas_Sub1.method53(0);
         Class162.method2205(-17413);
         Class109.method1663(33);
         Class3_Sub28_Sub17.method689();
         Class85.method1426(-25247);
         Class3_Sub22.method399(186);
         Class78.method1369();
         Class3_Sub24_Sub3.method463(-28918);
         Class3_Sub15.method372(true);
         Class38_Sub1.method1032(false);
         Class33.method999();
         Class68.method1274();
         Class43.method1059((byte)-2);
         Class151.method2093(1);
         Class62.method1223(0);
         Class3_Sub28_Sub10.method588((byte)120);
         Class143.method2063(0);
         Class74.method1333();
         Class4.method828(-90);
         Class49.method1130(99);
         Class3_Sub28_Sub9.method584(0);
         Class3_Sub28.method521(-3);
         Class47.method1096((byte)89);
         Class168.method2276(-2);
         Class139.method1858(-17124);
         Class100.method1606((byte)-48);
         Class24.method943(-9893);
         Class3_Sub28_Sub11.method605(221301966);
         Class117.method1721(true);
         Class115.method1712(69);
         Class16.method896(true);
         Class28.method964(6);
         Class79.method1388(true);
         Class29.method973((byte)62);
         Class3_Sub28_Sub12.method613(119);
         Class3_Sub28_Sub13.method624(-1);
         Class3_Sub28_Sub4.method547(-2951);
         Class7.method833((byte)126);
         Class3_Sub28_Sub1.method528(-1667);
         Class57.method1192((byte)-86);
         Class55.method1181((byte)-118);
         Class2.method80(-27401);
         Class102.method1612(-11565);
         Class3_Sub28_Sub20.method721(20413);
         Class3_Sub28_Sub18.method711(1);
         Class51.method1155();
         Class36.method1016((byte)127);
         Class1.method71((byte)-124);
         Class101.method1608((byte)110);
         Class53.method1169(false);
         Class44_Sub1.method1077(0);
         Class26.method960(31);
         Class88.method1457();
         Class137.method1818(false);
         Class54.method1178((byte)-93);
         Class10.method853(0);
         Class3_Sub16.method376(false);
         Class140.method1860(0);
         Class86.method1429((byte)53);
         Class3_Sub11.method147();
         Class25.method954(128);
         Class113.method1703(10967);
         Class70.method1284((byte)-87);
         Class19.method906((byte)112);
         Class12.method871((byte)115);
         Class72.method1296(1);
         Class126.method1751((byte)-58);
         Class35.method1011();
         Class3_Sub17.method380(-29113);
         Class56.method1187(30351);
         Class58.method1193(-26723);
         Class98.method1595();
         Class123.method1743(false);
         Class3_Sub28_Sub21.method726();
         Class121.method1733(-17148);
         Class141.method2045();
         Class169.method2283();
         Class77.method1365(119);
         Class110.method1682(-82);
         Class3_Sub7.method120(1000);
         Class3_Sub28_Sub6.f((int)3);
         Class3_Sub25.method510(-128);
         Class3_Sub9.method136(-3);
         Class39.method1034(8642);
         Class3_Sub28_Sub15.method632(-30497);
         Class116.method1715();
         Class161.method2202(-196);
         Class81.method1402((byte)73);
         Class22.method923();
         Class45.method1081((byte)81);
         Class140_Sub6.method2019(true);
         Class140_Sub2.method1954(0);
         Class107.method1646(true);
         Class140_Sub7.method2030((byte)83);
         Class3_Sub5.method113((byte)-120);
         Class140_Sub3.method1958(2);
         Class124.method1744(true);
         Class80.method1394((byte)-94);
         Class3_Sub29.method735(-22749);
         Class134.method1806(3846);
         Class3_Sub18.method382(1);
         Class3_Sub21.method396(0);
         Canvas_Sub2.method59((byte)-87);
         Class108.method1660(13123);
         Class129_Sub1.method1771(14635);
         Class158_Sub1.method2187(27316);
         Class120.method1731(12881);
         Class50.method1133((byte)81);
         Class69.method1283((byte)122);
         Class144.method2070((byte)67);
         Class105.method1641();
         Class9.method849(2);
         Class3_Sub28_Sub7.method563(3);
         Class3_Sub28_Sub7_Sub1.method570(-119);
         Class118.method1726(0);
         Class3_Sub6.method118(2);
         Class166.method2255((byte)-128);
         Class155_Sub1.method2166();
         Class103.method1623();
         Class21.method911(26);
         Class154.method2145((byte)-69);
         Class125.method1748();
         Class112.method1700();
         Class104.method1630((byte)-113);
         Class65.method1238(-112);
         Class3_Sub14.method361();
         Class59.method1204();
         Class3_Sub13_Sub4.method187(false);
         Class159.method2197(true);
         Class3_Sub13.method156(2);
         Class164.method2235(4);
         Class97.method1592((byte)102);
         Class114.method1704(65536);
         Class3_Sub10.method143(-46);
         Class82.method1409(false);
         Class44.method1071((byte)-115);
         Class164_Sub2.method2245((byte)-74);
         Class164_Sub1.method2240(128);
         Class27.method962((byte)-67);
         Class3_Sub8.method131(-109);
         Class32.method994('\u93bd');
         Class60.method1206((byte)26);
         int var2 = 87 % ((68 - var1) / 49);
         Class3_Sub13_Sub22.method274(-2);
         Class3_Sub13_Sub11.method217(1);
         Class3_Sub13_Sub31.method317(7759444);
         Class3_Sub13_Sub29.method309(true);
         Class3_Sub13_Sub19.method261(-125);
         Class3_Sub13_Sub24.method288((byte)110);
         Class3_Sub13_Sub2.method172(11597);
         Class3_Sub13_Sub27.method296((byte)-107);
         Class3_Sub13_Sub39.method357(false);
         Class3_Sub13_Sub8.method206(true);
         Class3_Sub13_Sub37.method348(48);
         Class3_Sub13_Sub20.method266(-1443422260);
         Class3_Sub13_Sub1.method168(-1771542303);
         Class3_Sub13_Sub30.method315(-15028);
         Class3_Sub13_Sub32.method321(-21136);
         Class3_Sub13_Sub16.method245(0);
         Class3_Sub13_Sub9.method209((byte)79);
         Class3_Sub13_Sub15.method241((byte)74);
         Class3_Sub13_Sub23_Sub1.method287(false);
         Class3_Sub13_Sub23.method277((byte)-41);
         Class3_Sub13_Sub18.method258(-97);
         Class3_Sub13_Sub13.method234(-3);
         Class3_Sub13_Sub35.method337(2);
         Class3_Sub13_Sub17.method249(-127);
         Class3_Sub13_Sub12.method227(true);
         Class3_Sub13_Sub34.method333((byte)-54);
         Class3_Sub13_Sub6.method197(1);
         Class3_Sub13_Sub7.method200((byte)122);
         Class3_Sub13_Sub25.method290(-9);
         Class3_Sub13_Sub33.method325(0);
         Class3_Sub13_Sub10.method211(1024);
         Class3_Sub13_Sub14.method238(9423);
         Class3_Sub13_Sub28.method300(103);
         Class3_Sub13_Sub3.method177((byte)119);
         Class3_Sub13_Sub26.method294((byte)30);
         Class3_Sub13_Sub36.method341((byte)85);
         Class3_Sub13_Sub21.method268((byte)-91);
         Class3_Sub13_Sub38.method351(-1);
         Class163_Sub2.method2218((byte)-83);
         Class163.method2208(30358);
         Class163_Sub2_Sub1.method2225((byte)-120);
         Class163_Sub3.method2227((byte)37);
         Class163_Sub1_Sub1.method2213((byte)104);
         Class163_Sub1.method2212(false);
         Class3_Sub28_Sub14.method627((byte)-122);
         Class3_Sub28_Sub19.method717(109);
         Class3_Sub28_Sub2.method534(99);
         Class3_Sub23.method405(true);
         InputStream_Sub1.method61(-93);
         OutputStream_Sub1.method67(true);
         Class3_Sub28_Sub8.method573(-11346);
         Class3_Sub20.method391(25);
         Class3_Sub26.method511((byte)121);
         Class75.method1334((byte)-115);
         Class75_Sub1.method1343(false);
         Class75_Sub3.method1348((byte)100);
         Class75_Sub4.method1350((byte)75);
         Class75_Sub2.method1345(-71);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "client.C(" + var1 + ')');
      }

      if(GameApplet.anInt12 != 0) {
         aBoolean2201 = true;
      }

   }

   static final Class3_Sub1 method44(Class11 var0) {
      Class3_Sub1 var1 = (Class3_Sub1)Class124.aClass130_1659.method1780(((long)var0.anInt279 << 32) + (long)var0.anInt191, 0);
      return var1 != null?var1:var0.aClass3_Sub1_257;
   }

   static final Class142 method45(int var0, byte var1) {
      try {
         if(var1 != -20) {
            aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])((Class3_Sub11[][])null);
         }

         Class142 var2 = (Class142)Class82.aClass93_1146.method1526((long)var0, (byte)121);
         if(var2 == null) {
            byte[] var3 = Class142.aClass153_1860.method2133(Class129.method1765(var0, -1732504441), (byte)-122, Class67.method1262(117, var0));
            var2 = new Class142();
            var2.anInt1864 = var0;
            if(var3 != null) {
               var2.method2053(new Class3_Sub30(var3), (byte)-102);
            }

            var2.method2058((byte)-41);
            Class82.aClass93_1146.method1515((byte)-103, var2, (long)var0);
            return var2;
         } else {
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.D(" + var0 + ',' + var1 + ')');
      }
   }

   private final void method46(boolean var1, int var2) {
      try {
         ++Class58.aClass66_917.anInt1011;
         Class17.aClass64_413 = null;
         if(!var1) {
            aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])((Class3_Sub11[][])null);
         }

         Class58.aClass66_917.anInt1010 = var2;
         InputStream_Sub1.aClass89_41 = null;
         Class4.anInt80 = 0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.P(" + var1 + ',' + var2 + ')');
      }
   }

   private final void method47(byte var1) {
      try {
         for(Class3_Sub23.anInt2537 = 0; Class3_Sub28_Sub10_Sub1.method591(83) && ~Class3_Sub23.anInt2537 > -129; ++Class3_Sub23.anInt2537) {
            Class133.anIntArray1755[Class3_Sub23.anInt2537] = Class3_Sub28_Sub9.anInt3624;
            Class120.anIntArray1638[Class3_Sub23.anInt2537] = Class3_Sub13_Sub27.anInt3342;
         }

         ++Class106.anInt1446;
         if(-1 != Class3_Sub28_Sub12.anInt3655) {
            Class28.method967(0, 0, 2, 0, Class23.anInt454, Class3_Sub28_Sub12.anInt3655, 0, Class140_Sub7.anInt2934);
         }

         ++Class3_Sub13_Sub17.anInt3213;
         if(Class138.aBoolean1807) {
            int var2 = 19137023;

            label191:
            for(int var3 = 0; ~var3 > -32769; ++var3) {
               Class140_Sub4_Sub2 var4 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var3];
               if(null != var4) {
                  byte var5 = var4.aClass90_3976.aByte1267;
                  if((var5 & 2) > 0 && -1 == ~var4.anInt2816 && 10.0D > Math.random() * 1000.0D) {
                     int var6 = (int)Math.round(-1.0D + 2.0D * Math.random());
                     int var7 = (int)Math.round(Math.random() * 2.0D - 1.0D);
                     if(var6 != 0 || 0 != var7) {
                        var4.aByteArray2795[0] = 1;
                        var4.anIntArray2767[0] = var6 + (var4.anInt2819 >> -1913236345);
                        var4.anIntArray2755[0] = var7 + (var4.anInt2829 >> -173151257);
                        Class86.aClass91Array1182[Class26.anInt501].method1502(var1 + 20850, var4.anInt2819 >> -649292601, var4.method1977((byte)114), false, 0, var4.method1977((byte)114), var4.anInt2829 >> 1442151015);
                        if(0 <= var4.anIntArray2767[0] && var4.anIntArray2767[0] <= 104 + -var4.method1977((byte)114) && 0 <= var4.anIntArray2755[0] && var4.anIntArray2755[0] <= 104 - var4.method1977((byte)114) && Class86.aClass91Array1182[Class26.anInt501].method1500(-2, var4.anInt2829 >> 2135388679, var4.anIntArray2755[0], var4.anIntArray2767[0], var4.anInt2819 >> 627928135)) {
                           if(var4.method1977((byte)114) > 1) {
                              for(int var8 = var4.anIntArray2767[0]; ~(var4.anIntArray2767[0] - -var4.method1977((byte)114)) < ~var8; ++var8) {
                                 for(int var9 = var4.anIntArray2755[0]; var4.anIntArray2755[0] + var4.method1977((byte)114) > var9; ++var9) {
                                    if((var2 & Class86.aClass91Array1182[Class26.anInt501].anIntArrayArray1304[var8][var9]) != 0) {
                                       continue label191;
                                    }
                                 }
                              }
                           }

                           var4.anInt2816 = 1;
                        }
                     }
                  }

                  Class55.method1180((byte)-122, var4);
                  Class17.method904(65536, var4);
                  Class16.method900(var4, var1 ^ -11974);
                  Class86.aClass91Array1182[Class26.anInt501].method1489(var4.anInt2819 >> -375465785, false, (byte)85, var4.anInt2829 >> 1678486439, var4.method1977((byte)114), var4.method1977((byte)114));
               }
            }
         }

         if(var1 != 1) {
            aClass94_2196 = (Class94)null;
         }

         if(!Class138.aBoolean1807) {
            Class3_Sub30.method744(true);
         } else if(0 == Class3_Sub13_Sub25.anInt3305 && 0 == Canvas_Sub1.anInt23) {
            if(~Class133.anInt1753 != -3) {
               Class3_Sub28_Sub6.d('\uffff');
            } else {
               Class3_Sub16.method379(var1 ^ 1025);
            }

            if(14 > Class140_Sub4_Sub2.anInt3995 >> -1377844697 || Class140_Sub4_Sub2.anInt3995 >> 2015386375 >= 90 || 14 > Class77.anInt1111 >> -944239097 || -91 >= ~(Class77.anInt1111 >> -1325288249)) {
               Class3_Sub13_Sub6.method195(var1 ^ 20478);
            }
         }

         while(true) {
            Class3_Sub16 var11 = (Class3_Sub16)Class4.aClass61_82.method1220((byte)-3);
            Class11 var12;
            Class11 var13;
            if(var11 == null) {
               while(true) {
                  var11 = (Class3_Sub16)Class65.aClass61_983.method1220((byte)-3);
                  if(null == var11) {
                     while(true) {
                        var11 = (Class3_Sub16)Class110.aClass61_1471.method1220((byte)-3);
                        if(null == var11) {
                           if(Class56.aClass11_886 != null) {
                              Class4.method829(-1);
                           }

                           if(null != Class15.aClass64_351 && Class15.aClass64_351.anInt978 == 1) {
                              if(null != Class15.aClass64_351.anObject974) {
                                 Class99.method1596(Class3_Sub13_Sub24.aClass94_3295, (byte)126, Class94.aBoolean2154);
                              }

                              Class94.aBoolean2154 = false;
                              Class3_Sub13_Sub24.aClass94_3295 = null;
                              Class15.aClass64_351 = null;
                           }

                           if(Class44.anInt719 % 1500 == 0) {
                              Class72.method1293(true);
                           }

                           return;
                        }

                        var12 = var11.aClass11_2449;
                        if(0 <= var12.anInt191) {
                           var13 = Class7.method832((byte)118, var12.anInt190);
                           if(var13 == null || null == var13.aClass11Array262 || ~var13.aClass11Array262.length >= ~var12.anInt191 || var12 != var13.aClass11Array262[var12.anInt191]) {
                              continue;
                           }
                        }

                        Class43.method1065(1073376993, var11);
                     }
                  }

                  var12 = var11.aClass11_2449;
                  if(~var12.anInt191 <= -1) {
                     var13 = Class7.method832((byte)112, var12.anInt190);
                     if(null == var13 || var13.aClass11Array262 == null || ~var12.anInt191 <= ~var13.aClass11Array262.length || var12 != var13.aClass11Array262[var12.anInt191]) {
                        continue;
                     }
                  }

                  Class43.method1065(1073376993, var11);
               }
            }

            var12 = var11.aClass11_2449;
            if(var12.anInt191 >= 0) {
               var13 = Class7.method832((byte)126, var12.anInt190);
               if(null == var13 || null == var13.aClass11Array262 || ~var13.aClass11Array262.length >= ~var12.anInt191 || var12 != var13.aClass11Array262[var12.anInt191]) {
                  continue;
               }
            }

            Class43.method1065(var1 ^ 1073376992, var11);
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "client.I(" + var1 + ')');
      }
   }

   private final void method48(boolean var1) {
      try {
         boolean var2 = Class58.aClass66_917.method1243((byte)-61);
         if(!var1) {
            aClass94_2198 = (Class94)null;
         }

         if(!var2) {
            this.method49(-31379);
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "client.J(" + var1 + ')');
      }
   }

   private final void method49(int var1) {
      try {
         if(var1 != -31379) {
            method51((Class11)null);
         }

         if(~Class163_Sub2_Sub1.anInt4026 > ~Class58.aClass66_917.anInt1011) {
            Class3_Sub13_Sub5.anInt3068 = 5 * 50 * (Class58.aClass66_917.anInt1011 + -1);
            if(Class162.anInt2036 != Class140_Sub6.anInt2894) {
               Class140_Sub6.anInt2894 = Class162.anInt2036;
            } else {
               Class140_Sub6.anInt2894 = Class26.anInt506;
            }

            if(Class3_Sub13_Sub5.anInt3068 > 3000) {
               Class3_Sub13_Sub5.anInt3068 = 3000;
            }

            if(~Class58.aClass66_917.anInt1011 <= -3 && Class58.aClass66_917.anInt1010 == 6) {
               this.gameError("js5connect_outofdate", -48);
               Class143.anInt1875 = 1000;
               return;
            }

            if(-5 >= ~Class58.aClass66_917.anInt1011 && ~Class58.aClass66_917.anInt1010 == 0) {
               this.gameError("js5crc", -48);
               Class143.anInt1875 = 1000;
               return;
            }

            if(Class58.aClass66_917.anInt1011 >= 4 && (Class143.anInt1875 == 0 || -6 == ~Class143.anInt1875)) {
               if(~Class58.aClass66_917.anInt1010 != -8 && -10 != ~Class58.aClass66_917.anInt1010) {
                  if(Class58.aClass66_917.anInt1010 > 0) {
                     this.gameError("js5connect", -48);
                  } else {
                     this.gameError("js5io", -48);
                  }
               } else {
                  this.gameError("js5connect_full", -48);
               }

               Class143.anInt1875 = 1000;
               return;
            }
         }

         Class163_Sub2_Sub1.anInt4026 = Class58.aClass66_917.anInt1011;
         if(~Class3_Sub13_Sub5.anInt3068 < -1) {
            --Class3_Sub13_Sub5.anInt3068;
         } else {
            try {
               if(~Class4.anInt80 == -1) {
                  Class17.aClass64_413 = Class38.aClass87_665.method1441((byte)8, Class38_Sub1.aString2611, Class140_Sub6.anInt2894);
                  ++Class4.anInt80;
               }

               if(Class4.anInt80 == 1) {
                  if(2 == Class17.aClass64_413.anInt978) {
                     this.method46(true, 1000);
                     return;
                  }

                  if(~Class17.aClass64_413.anInt978 == -2) {
                     ++Class4.anInt80;
                  }
               }

               if(2 == Class4.anInt80) {
                  InputStream_Sub1.aClass89_41 = new Class89((Socket)Class17.aClass64_413.anObject974, Class38.aClass87_665);
                  Class3_Sub30 var2 = new Class3_Sub30(5);
                  var2.method752((byte)-69, 15);
                  var2.method738(var1 + 31252, 530);
                  InputStream_Sub1.aClass89_41.method1464(false, 0, var2.aByteArray2590, 5);
                  ++Class4.anInt80;
                  Class3_Sub13_Sub30.aLong3366 = Class5.method830((byte)-55);
               }

               if(3 == Class4.anInt80) {
                  if(-1 != ~Class143.anInt1875 && ~Class143.anInt1875 != -6 && 0 >= InputStream_Sub1.aClass89_41.method1465(var1 ^ 15655)) {
                     if(~(Class5.method830((byte)-55) + -Class3_Sub13_Sub30.aLong3366) < -30001L) {
                        this.method46(true, 1001);
                        return;
                     }
                  } else {
                     int var5 = InputStream_Sub1.aClass89_41.method1462(0);
                     if(-1 != ~var5) {
                        this.method46(true, var5);
                        return;
                     }

                     ++Class4.anInt80;
                  }
               }

               if(-5 == ~Class4.anInt80) {
                  boolean var6 = ~Class143.anInt1875 == -6 || -11 == ~Class143.anInt1875 || Class143.anInt1875 == 28;
                  Class58.aClass66_917.method1249(!var6, InputStream_Sub1.aClass89_41, var1 + 31379);
                  InputStream_Sub1.aClass89_41 = null;
                  Class17.aClass64_413 = null;
                  Class4.anInt80 = 0;
               }
            } catch (IOException var3) {
               this.method46(true, 1002);
            }

         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.E(" + var1 + ')');
      }
   }

   public static final void main(String[] args) {
      try {
         try {
            if(4 != args.length) {
               Class3_Sub13_Sub23_Sub1.loadGameError("argument count", (byte)38);
            }

            int var1 = -1;
            Class111.worldId = Integer.parseInt(args[0]);
            Class44.anInt718 = 2;
            if(!args[1].equals("live")) {
               if(args[1].equals("rc")) {
                  Class3_Sub13_Sub13.clientMode = 1;
               } else if(!args[1].equals("wip")) {
                  Class3_Sub13_Sub23_Sub1.loadGameError("modewhat", (byte)38);
               } else {
                  Class3_Sub13_Sub13.clientMode = 2;
               }
            } else {
               Class3_Sub13_Sub13.clientMode = 0;
            }

            Class3_Sub28_Sub19.aBoolean3779 = false;

            try {
               byte[] var2 = args[2].getBytes("ISO-8859-1");
               var1 = Class3_Sub13_Sub16.method243(Class3_Sub13_Sub3.method178(var2, -4114, var2.length, 0), (byte)13);
            } catch (Exception var3) {
               ;
            }

            if(-1 == var1) {
               if(!args[2].equals("english")) {
                  if(args[2].equals("german")) {
                     Class3_Sub20.clientLanguage = 1;
                  } else {
                     Class3_Sub13_Sub23_Sub1.loadGameError("language", (byte)38);
                  }
               } else {
                  Class3_Sub20.clientLanguage = 0;
               }
            } else {
               Class3_Sub20.clientLanguage = var1;
            }

            Class3.method87(-78, Class3_Sub20.clientLanguage);
            Class163_Sub2_Sub1.aBoolean4018 = false;
            Class3_Sub28_Sub11.aBoolean3641 = false;
            if(!args[3].equals("game0")) {
               if(!args[3].equals("game1")) {
                  Class3_Sub13_Sub23_Sub1.loadGameError("game", (byte)38);
               } else {
                  Class158.clientGameType = 1;
               }
            } else {
               Class158.clientGameType = 0;
            }

            Class3_Sub31.anInt2607 = 0;
            Class106.aBoolean1451 = false;
            Class3_Sub26.anInt2554 = 0;
            Class163_Sub2.aClass94_2996 = Class3_Sub28_Sub14.aClass94_3672;
            client var6 = new client();
            Class126.aClient1671 = var6;
            var6.method40(32 - -Class3_Sub13_Sub13.clientMode, 530, false, 1024, "runescape", 768, -8057, 28);
            Class3_Sub13_Sub7.aFrame3092.setLocation(40, 40);
         } catch (Exception var4) {
            Class49.method1125((String)null, var4, (byte)119);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "client.main(" + (args != null?"{...}":"null") + ')');
      }
   }

   static final void method50(Class11[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         Class11 var9 = var0[var8];
         if(var9 != null && var9.anInt190 == var1 && (!var9.aBoolean233 || var9.anInt187 == 0 || var9.aBoolean195 || method44(var9).anInt2205 != 0 || var9 == Class4.aClass11_88 || var9.anInt189 == 1338) && (!var9.aBoolean233 || !method51(var9))) {
            int var10 = var9.anInt306 + var6;
            int var11 = var9.anInt210 + var7;
            int var12;
            int var13;
            int var14;
            int var15;
            if(var9.anInt187 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16 = var10 + var9.anInt168;
               int var17 = var11 + var9.anInt193;
               if(var9.anInt187 == 9) {
                  ++var16;
                  ++var17;
               }

               var12 = var10 > var2?var10:var2;
               var13 = var11 > var3?var11:var3;
               var14 = var16 < var4?var16:var4;
               var15 = var17 < var5?var17:var5;
            }

            if(var9 == Class56.aClass11_886) {
               Class21.aBoolean440 = true;
               Class3_Sub15.anInt2421 = var10;
               Class3_Sub2.anInt2218 = var11;
            }

            if(!var9.aBoolean233 || var12 < var14 && var13 < var15) {
               if(var9.anInt187 == 0) {
                  if(!var9.aBoolean233 && method51(var9) && Class107.aClass11_1453 != var9) {
                     continue;
                  }

                  if(var9.aBoolean219 && Class126.anInt1676 >= var12 && Class130.anInt1709 >= var13 && Class126.anInt1676 < var14 && Class130.anInt1709 < var15) {
                     for(Class3_Sub16 var27 = (Class3_Sub16)Class110.aClass61_1471.method1222(-18); var27 != null; var27 = (Class3_Sub16)Class110.aClass61_1471.method1221(4)) {
                        if(var27.aBoolean2446) {
                           var27.method86(-1024);
                           var27.aClass11_2449.aBoolean163 = false;
                        }
                     }

                     if(Class75_Sub3.anInt2658 == 0) {
                        Class56.aClass11_886 = null;
                        Class4.aClass11_88 = null;
                     }

                     Class3_Sub19.anInt2475 = 0;
                  }
               }

               if(var9.aBoolean233) {
                  boolean var26;
                  if(Class126.anInt1676 >= var12 && Class130.anInt1709 >= var13 && Class126.anInt1676 < var14 && Class130.anInt1709 < var15) {
                     var26 = true;
                  } else {
                     var26 = false;
                  }

                  boolean var25 = false;
                  if(Class3_Sub13_Sub5.anInt3069 == 1 && var26) {
                     var25 = true;
                  }

                  boolean var18 = false;
                  if(Class3_Sub28_Sub11.anInt3644 == 1 && Class163_Sub1.anInt2993 >= var12 && Class38_Sub1.anInt2614 >= var13 && Class163_Sub1.anInt2993 < var14 && Class38_Sub1.anInt2614 < var15) {
                     var18 = true;
                  }

                  int var19;
                  int var21;
                  if(var9.aByteArray263 != null) {
                     for(var19 = 0; var19 < var9.aByteArray263.length; ++var19) {
                        if(!Class111.aBooleanArray1490[var9.aByteArray263[var19]]) {
                           if(var9.anIntArray310 != null) {
                              var9.anIntArray310[var19] = 0;
                           }
                        } else if(var9.anIntArray310 == null || Class44.anInt719 >= var9.anIntArray310[var19]) {
                           byte var20 = var9.aByteArray231[var19];
                           if(var20 == 0 || ((var20 & 2) == 0 || Class111.aBooleanArray1490[86]) && ((var20 & 1) == 0 || Class111.aBooleanArray1490[82]) && ((var20 & 4) == 0 || Class111.aBooleanArray1490[81])) {
                              OutputStream_Sub1.method66(Class3_Sub28_Sub14.aClass94_3672, -1, var19 + 1, (byte)-29, var9.anInt279);
                              var21 = var9.anIntArray299[var19];
                              if(var9.anIntArray310 == null) {
                                 var9.anIntArray310 = new int[var9.aByteArray263.length];
                              }

                              if(var21 != 0) {
                                 var9.anIntArray310[var19] = Class44.anInt719 + var21;
                              } else {
                                 var9.anIntArray310[var19] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if(var18) {
                     Class3_Sub28_Sub6.a(Class38_Sub1.anInt2614 - var11, Class163_Sub1.anInt2993 - var10, 97, var9);
                  }

                  if(Class56.aClass11_886 != null && Class56.aClass11_886 != var9 && var26 && method44(var9).method98(false)) {
                     Class27.aClass11_526 = var9;
                  }

                  if(var9 == Class4.aClass11_88) {
                     Class85.aBoolean1167 = true;
                     Class3_Sub13_Sub13.anInt3156 = var10;
                     Class134.anInt1761 = var11;
                  }

                  if(var9.aBoolean195 || var9.anInt189 != 0) {
                     Class3_Sub16 var30;
                     if(var26 && Class29.anInt561 != 0 && var9.anObjectArray183 != null) {
                        var30 = new Class3_Sub16();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2441 = Class29.anInt561;
                        var30.anObjectArray2448 = var9.anObjectArray183;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(Class56.aClass11_886 != null || Class67.aClass11_1017 != null || Class38_Sub1.aBoolean2615 || var9.anInt189 != 1400 && Class3_Sub19.anInt2475 > 0) {
                        var18 = false;
                        var25 = false;
                        var26 = false;
                     }

                     int var29;
                     if(var9.anInt189 != 0) {
                        if(var9.anInt189 == 1337) {
                           Class168.aClass11_2091 = var9;
                           Class20.method909(124, var9);
                           continue;
                        }

                        if(var9.anInt189 == 1338) {
                           if(var18) {
                              Class1.anInt56 = Class163_Sub1.anInt2993 - var10;
                              Class58.anInt916 = Class38_Sub1.anInt2614 - var11;
                           }
                           continue;
                        }

                        if(var9.anInt189 == 1400) {
                           Class3_Sub28_Sub3.aClass11_3551 = var9;
                           if(var18) {
                              if(Class111.aBooleanArray1490[82] && Class3_Sub13_Sub26.anInt3320 > 0) {
                                 var19 = (int)((double)(Class163_Sub1.anInt2993 - var10 - var9.anInt168 / 2) * 2.0D / (double)Class44.aFloat727);
                                 var29 = (int)((double)(Class38_Sub1.anInt2614 - var11 - var9.anInt193 / 2) * 2.0D / (double)Class44.aFloat727);
                                 var21 = Class3_Sub28_Sub1.anInt3536 + var19;
                                 int var32 = Class3_Sub4.anInt2251 + var29;
                                 int var23 = var21 + Class3_Sub13_Sub21.anInt3256;
                                 int var24 = Class108.anInt1460 - 1 - var32 + Class2.anInt65;
                                 Class30.method979(var23, var24, 0, (byte)-4);
                                 Class3_Sub13_Sub19.method264((byte)126);
                                 continue;
                              }

                              Class3_Sub19.anInt2475 = 1;
                              Class144.anInt1881 = Class126.anInt1676;
                              Class95.anInt1336 = Class130.anInt1709;
                              continue;
                           }

                           if(var25 && Class3_Sub19.anInt2475 > 0) {
                              if(Class3_Sub19.anInt2475 == 1 && (Class144.anInt1881 != Class126.anInt1676 || Class95.anInt1336 != Class130.anInt1709)) {
                                 Class3_Sub28_Sub10_Sub2.anInt4073 = Class3_Sub28_Sub1.anInt3536;
                                 Class38.anInt660 = Class3_Sub4.anInt2251;
                                 Class3_Sub19.anInt2475 = 2;
                              }

                              if(Class3_Sub19.anInt2475 == 2) {
                                 Class54.method1175(Class3_Sub28_Sub10_Sub2.anInt4073 + (int)((double)(Class144.anInt1881 - Class126.anInt1676) * 2.0D / (double)Class140_Sub4_Sub2.aFloat3979), 112);
                                 Class3_Sub13_Sub39.method354(-126, Class38.anInt660 + (int)((double)(Class95.anInt1336 - Class130.anInt1709) * 2.0D / (double)Class140_Sub4_Sub2.aFloat3979));
                              }
                              continue;
                           }

                           Class3_Sub19.anInt2475 = 0;
                           continue;
                        }

                        if(var9.anInt189 == 1401) {
                           if(var25) {
                              Class3_Sub13_Sub17.method253(-22611, var9.anInt168, Class130.anInt1709 - var11, Class126.anInt1676 - var10, var9.anInt193);
                           }
                           continue;
                        }

                        if(var9.anInt189 == 1402) {
                           if(!Class138.aBoolean1807) {
                              Class20.method909(113, var9);
                           }
                           continue;
                        }
                     }

                     if(!var9.aBoolean188 && var18) {
                        var9.aBoolean188 = true;
                        if(var9.anObjectArray165 != null) {
                           var30 = new Class3_Sub16();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = Class163_Sub1.anInt2993 - var10;
                           var30.anInt2441 = Class38_Sub1.anInt2614 - var11;
                           var30.anObjectArray2448 = var9.anObjectArray165;
                           Class110.aClass61_1471.method1215(true, var30);
                        }
                     }

                     if(var9.aBoolean188 && var25 && var9.anObjectArray170 != null) {
                        var30 = new Class3_Sub16();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = Class126.anInt1676 - var10;
                        var30.anInt2441 = Class130.anInt1709 - var11;
                        var30.anObjectArray2448 = var9.anObjectArray170;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(var9.aBoolean188 && !var25) {
                        var9.aBoolean188 = false;
                        if(var9.anObjectArray239 != null) {
                           var30 = new Class3_Sub16();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = Class126.anInt1676 - var10;
                           var30.anInt2441 = Class130.anInt1709 - var11;
                           var30.anObjectArray2448 = var9.anObjectArray239;
                           Class65.aClass61_983.method1215(true, var30);
                        }
                     }

                     if(var25 && var9.anObjectArray180 != null) {
                        var30 = new Class3_Sub16();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = Class126.anInt1676 - var10;
                        var30.anInt2441 = Class130.anInt1709 - var11;
                        var30.anObjectArray2448 = var9.anObjectArray180;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(!var9.aBoolean163 && var26) {
                        var9.aBoolean163 = true;
                        if(var9.anObjectArray248 != null) {
                           var30 = new Class3_Sub16();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = Class126.anInt1676 - var10;
                           var30.anInt2441 = Class130.anInt1709 - var11;
                           var30.anObjectArray2448 = var9.anObjectArray248;
                           Class110.aClass61_1471.method1215(true, var30);
                        }
                     }

                     if(var9.aBoolean163 && var26 && var9.anObjectArray276 != null) {
                        var30 = new Class3_Sub16();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = Class126.anInt1676 - var10;
                        var30.anInt2441 = Class130.anInt1709 - var11;
                        var30.anObjectArray2448 = var9.anObjectArray276;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(var9.aBoolean163 && !var26) {
                        var9.aBoolean163 = false;
                        if(var9.anObjectArray281 != null) {
                           var30 = new Class3_Sub16();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = Class126.anInt1676 - var10;
                           var30.anInt2441 = Class130.anInt1709 - var11;
                           var30.anObjectArray2448 = var9.anObjectArray281;
                           Class65.aClass61_983.method1215(true, var30);
                        }
                     }

                     if(var9.anObjectArray269 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray269;
                        Class4.aClass61_82.method1215(true, var30);
                     }

                     Class3_Sub16 var22;
                     if(var9.anObjectArray161 != null && Class4.anInt87 > var9.anInt284) {
                        if(var9.anIntArray211 != null && Class4.anInt87 - var9.anInt284 <= 32) {
                           label531:
                           for(var19 = var9.anInt284; var19 < Class4.anInt87; ++var19) {
                              var29 = Class140_Sub4_Sub2.anIntArray3986[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray211.length; ++var21) {
                                 if(var9.anIntArray211[var21] == var29) {
                                    var22 = new Class3_Sub16();
                                    var22.aClass11_2449 = var9;
                                    var22.anObjectArray2448 = var9.anObjectArray161;
                                    Class110.aClass61_1471.method1215(true, var22);
                                    break label531;
                                 }
                              }
                           }
                        } else {
                           var30 = new Class3_Sub16();
                           var30.aClass11_2449 = var9;
                           var30.anObjectArray2448 = var9.anObjectArray161;
                           Class110.aClass61_1471.method1215(true, var30);
                        }

                        var9.anInt284 = Class4.anInt87;
                     }

                     if(var9.anObjectArray221 != null && Class3_Sub9.anInt2317 > var9.anInt242) {
                        if(var9.anIntArray185 != null && Class3_Sub9.anInt2317 - var9.anInt242 <= 32) {
                           label512:
                           for(var19 = var9.anInt242; var19 < Class3_Sub9.anInt2317; ++var19) {
                              var29 = Class163_Sub2_Sub1.anIntArray4025[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray185.length; ++var21) {
                                 if(var9.anIntArray185[var21] == var29) {
                                    var22 = new Class3_Sub16();
                                    var22.aClass11_2449 = var9;
                                    var22.anObjectArray2448 = var9.anObjectArray221;
                                    Class110.aClass61_1471.method1215(true, var22);
                                    break label512;
                                 }
                              }
                           }
                        } else {
                           var30 = new Class3_Sub16();
                           var30.aClass11_2449 = var9;
                           var30.anObjectArray2448 = var9.anObjectArray221;
                           Class110.aClass61_1471.method1215(true, var30);
                        }

                        var9.anInt242 = Class3_Sub9.anInt2317;
                     }

                     if(var9.anObjectArray282 != null && Class36.anInt641 > var9.anInt213) {
                        if(var9.anIntArray286 != null && Class36.anInt641 - var9.anInt213 <= 32) {
                           label493:
                           for(var19 = var9.anInt213; var19 < Class36.anInt641; ++var19) {
                              var29 = Class44.anIntArray726[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray286.length; ++var21) {
                                 if(var9.anIntArray286[var21] == var29) {
                                    var22 = new Class3_Sub16();
                                    var22.aClass11_2449 = var9;
                                    var22.anObjectArray2448 = var9.anObjectArray282;
                                    Class110.aClass61_1471.method1215(true, var22);
                                    break label493;
                                 }
                              }
                           }
                        } else {
                           var30 = new Class3_Sub16();
                           var30.aClass11_2449 = var9;
                           var30.anObjectArray2448 = var9.anObjectArray282;
                           Class110.aClass61_1471.method1215(true, var30);
                        }

                        var9.anInt213 = Class36.anInt641;
                     }

                     if(var9.anObjectArray174 != null && Class62.anInt944 > var9.anInt255) {
                        if(var9.anIntArray175 != null && Class62.anInt944 - var9.anInt255 <= 32) {
                           label474:
                           for(var19 = var9.anInt255; var19 < Class62.anInt944; ++var19) {
                              var29 = Class3_Sub28_Sub4.anIntArray3565[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray175.length; ++var21) {
                                 if(var9.anIntArray175[var21] == var29) {
                                    var22 = new Class3_Sub16();
                                    var22.aClass11_2449 = var9;
                                    var22.anObjectArray2448 = var9.anObjectArray174;
                                    Class110.aClass61_1471.method1215(true, var22);
                                    break label474;
                                 }
                              }
                           }
                        } else {
                           var30 = new Class3_Sub16();
                           var30.aClass11_2449 = var9;
                           var30.anObjectArray2448 = var9.anObjectArray174;
                           Class110.aClass61_1471.method1215(true, var30);
                        }

                        var9.anInt255 = Class62.anInt944;
                     }

                     if(var9.anObjectArray158 != null && Class49.anInt815 > var9.anInt311) {
                        if(var9.anIntArray274 != null && Class49.anInt815 - var9.anInt311 <= 32) {
                           label455:
                           for(var19 = var9.anInt311; var19 < Class49.anInt815; ++var19) {
                              var29 = Class3_Sub28_Sub19.anIntArray3780[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray274.length; ++var21) {
                                 if(var9.anIntArray274[var21] == var29) {
                                    var22 = new Class3_Sub16();
                                    var22.aClass11_2449 = var9;
                                    var22.anObjectArray2448 = var9.anObjectArray158;
                                    Class110.aClass61_1471.method1215(true, var22);
                                    break label455;
                                 }
                              }
                           }
                        } else {
                           var30 = new Class3_Sub16();
                           var30.aClass11_2449 = var9;
                           var30.anObjectArray2448 = var9.anObjectArray158;
                           Class110.aClass61_1471.method1215(true, var30);
                        }

                        var9.anInt311 = Class49.anInt815;
                     }

                     if(Class24.anInt472 > var9.anInt234 && var9.anObjectArray256 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray256;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(Class110.anInt1472 > var9.anInt234 && var9.anObjectArray156 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray156;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(Class167.anInt2087 > var9.anInt234 && var9.anObjectArray313 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray313;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(Class121.anInt1642 > var9.anInt234 && var9.anObjectArray268 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray268;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     if(Class140_Sub6.anInt2905 > var9.anInt234 && var9.anObjectArray315 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray315;
                        Class110.aClass61_1471.method1215(true, var30);
                     }

                     var9.anInt234 = Class3_Sub13_Sub17.anInt3213;
                     if(var9.anObjectArray220 != null) {
                        for(var19 = 0; var19 < Class3_Sub23.anInt2537; ++var19) {
                           Class3_Sub16 var31 = new Class3_Sub16();
                           var31.aClass11_2449 = var9;
                           var31.anInt2444 = Class133.anIntArray1755[var19];
                           var31.anInt2443 = Class120.anIntArray1638[var19];
                           var31.anObjectArray2448 = var9.anObjectArray220;
                           Class110.aClass61_1471.method1215(true, var31);
                        }
                     }

                     if(Class3_Sub28_Sub1.aBoolean3531 && var9.anObjectArray217 != null) {
                        var30 = new Class3_Sub16();
                        var30.aClass11_2449 = var9;
                        var30.anObjectArray2448 = var9.anObjectArray217;
                        Class110.aClass61_1471.method1215(true, var30);
                     }
                  }
               }

               if(!var9.aBoolean233 && Class56.aClass11_886 == null && Class67.aClass11_1017 == null && !Class38_Sub1.aBoolean2615) {
                  if((var9.anInt212 >= 0 || var9.anInt228 != 0) && Class126.anInt1676 >= var12 && Class130.anInt1709 >= var13 && Class126.anInt1676 < var14 && Class130.anInt1709 < var15) {
                     if(var9.anInt212 >= 0) {
                        Class107.aClass11_1453 = var0[var9.anInt212];
                     } else {
                        Class107.aClass11_1453 = var9;
                     }
                  }

                  if(var9.anInt187 == 8 && Class126.anInt1676 >= var12 && Class130.anInt1709 >= var13 && Class126.anInt1676 < var14 && Class130.anInt1709 < var15) {
                     Class20.aClass11_439 = var9;
                  }

                  if(var9.anInt252 > var9.anInt193) {
                     Class137.method1819(Class130.anInt1709, var9.anInt193, var9, (byte)-101, Class126.anInt1676, var10 + var9.anInt168, var11, var9.anInt252);
                  }
               }

               if(var9.anInt187 == 0) {
                  method50(var0, var9.anInt279, var12, var13, var14, var15, var10 - var9.anInt247, var11 - var9.anInt208);
                  if(var9.aClass11Array262 != null) {
                     method50(var9.aClass11Array262, var9.anInt279, var12, var13, var14, var15, var10 - var9.anInt247, var11 - var9.anInt208);
                  }

                  Class3_Sub31 var28 = (Class3_Sub31)Class3_Sub13_Sub17.aClass130_3208.method1780((long)var9.anInt279, 0);
                  if(var28 != null) {
                     Class28.method967(var10, var13, 2, var11, var14, var28.anInt2602, var12, var15);
                  }
               }
            }
         }
      }

   }

   static final boolean method51(Class11 var0) {
      if(Class69.aBoolean1040) {
         if(method44(var0).anInt2205 != 0) {
            return false;
         }

         if(var0.anInt187 == 0) {
            return false;
         }
      }

      return var0.aBoolean155;
   }

   private final void method52(int var1) {
      try {
         if(!Class94.aBoolean2146) {
            while(Class3_Sub28_Sub10_Sub1.method591(107)) {
               if(~Class3_Sub13_Sub27.anInt3342 == -116 || ~Class3_Sub13_Sub27.anInt3342 == -84) {
                  Class94.aBoolean2146 = true;
               }
            }
         }

         if(var1 >= 46) {
            int var3;
            if(Class96.anInt1354 == 0) {
               Runtime var10 = Runtime.getRuntime();
               var3 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
               long var4 = Class5.method830((byte)-55);
               if(-1L == ~Class3_Sub13_Sub24.aLong3296) {
                  Class3_Sub13_Sub24.aLong3296 = var4;
               }

               if(var3 > 16384 && 5000L > -Class3_Sub13_Sub24.aLong3296 + var4) {
                  if(-Class91.aLong1310 + var4 > 1000L) {
                     System.gc();
                     Class91.aLong1310 = var4;
                  }

                  Class3_Sub28_Sub15.anInt3684 = 5;
                  Class3_Sub17.aClass94_2464 = Class3_Sub13_Sub23_Sub1.aClass94_4040;
               } else {
                  Class3_Sub17.aClass94_2464 = Class94.allocatedMemoryString;
                  Class96.anInt1354 = 10;
                  Class3_Sub28_Sub15.anInt3684 = 5;
               }
            } else {
               int var2;
               if(-11 == ~Class96.anInt1354) {
                  Class68.method1267(4, 104, 104);

                  for(var2 = 0; -5 < ~var2; ++var2) {
                     Class86.aClass91Array1182[var2] = new Class91(104, 104);
                  }

                  Class3_Sub28_Sub15.anInt3684 = 10;
                  Class96.anInt1354 = 30;
                  Class3_Sub17.aClass94_2464 = Class3_Sub28_Sub10.aClass94_3629;
               } else if(Class96.anInt1354 == 30) {
                  if(Class151.aClass8_1936 == null) {
                     Class151.aClass8_1936 = new Class8(Class58.aClass66_917, Class3_Sub13_Sub14.aClass73_3159);
                  }

                  if(Class151.aClass8_1936.method837(255)) {
                     Class75_Sub3.aClass153_2660 = Class8.method842(false, true, true, 0, true);
                     Class3_Sub28_Sub19.aClass153_3772 = Class8.method842(false, true, true, 1, true);
                     Class164.aClass153_2052 = Class8.method842(true, true, false, 2, true);
                     Class140_Sub3.aClass153_2727 = Class8.method842(false, true, true, 3, true);
                     Class146.aClass153_1902 = Class8.method842(false, true, true, 4, true);
                     Class3_Sub13_Sub6.aClass153_3077 = Class8.method842(true, true, true, 5, true);
                     Class75_Sub2.aClass153_2645 = Class8.method842(true, false, true, 6, true);
                     Class159.aClass153_2019 = Class8.method842(false, true, true, 7, true);
                     Class140_Sub6.aClass153_2906 = Class8.method842(false, true, true, 8, true);
                     Class3_Sub13_Sub28.aClass153_3352 = Class8.method842(false, true, true, 9, true);
                     Class3_Sub13_Sub25.aClass153_3304 = Class8.method842(false, true, true, 10, true);
                     Class3_Sub28.aClass153_2573 = Class8.method842(false, true, true, 11, true);
                     Class3_Sub1.aClass153_2203 = Class8.method842(false, true, true, 12, true);
                     Class153.aClass153_1948 = Class8.method842(false, true, true, 13, true);
                     Class3_Sub19.aClass153_2474 = Class8.method842(false, false, true, 14, true);
                     Class140_Sub4_Sub2.aClass153_3994 = Class8.method842(false, true, true, 15, true);
                     Class168.aClass153_2097 = Class8.method842(false, true, true, 16, true);
                     Class140_Sub4_Sub2.aClass153_3993 = Class8.method842(false, true, true, 17, true);
                     Class101.aClass153_1428 = Class8.method842(false, true, true, 18, true);
                     Class100.aClass153_1410 = Class8.method842(false, true, true, 19, true);
                     Class3_Sub13_Sub36.aClass153_3429 = Class8.method842(false, true, true, 20, true);
                     Class70.aClass153_1058 = Class8.method842(false, true, true, 21, true);
                     Class3_Sub22.aClass153_2528 = Class8.method842(false, true, true, 22, true);
                     Class133.aClass153_1751 = Class8.method842(true, true, true, 23, true);
                     Class140_Sub7.aClass153_2939 = Class8.method842(false, true, true, 24, true);
                     Class3_Sub4.aClass153_2258 = Class8.method842(false, true, true, 25, true);
                     Class97.aClass153_1376 = Class8.method842(true, true, true, 26, true);
                     Class132.aClass153_1735 = Class8.method842(false, true, true, 27, true);
                     Class3_Sub28_Sub15.anInt3684 = 15;
                     Class3_Sub17.aClass94_2464 = Class106.aClass94_1445;
                     Class96.anInt1354 = 40;
                  } else {
                     Class3_Sub17.aClass94_2464 = Class157.aClass94_1995;
                     Class3_Sub28_Sub15.anInt3684 = 12;
                  }
               } else if(~Class96.anInt1354 != -41) {
                  if(~Class96.anInt1354 == -46) {
                     Class140_Sub3.method1959(256, 2, 22050, Class3_Sub13_Sub15.aBoolean3184);
                     Class86.aClass3_Sub24_Sub4_1193 = new Class3_Sub24_Sub4();
                     Class86.aClass3_Sub24_Sub4_1193.method479((byte)98, 9, 128);
                     Class44_Sub1.aClass155_2627 = Class58.method1195(22050, Class38.aClass87_665, Class3_Sub28_Sub12.aCanvas3648, 0, 14);
                     Class44_Sub1.aClass155_2627.method2154(-116, Class86.aClass3_Sub24_Sub4_1193);
                     Class16.method897(17770, Class86.aClass3_Sub24_Sub4_1193, Class140_Sub4_Sub2.aClass153_3994, Class3_Sub19.aClass153_2474, Class146.aClass153_1902);
                     Class3_Sub21.aClass155_2491 = Class58.method1195(2048, Class38.aClass87_665, Class3_Sub28_Sub12.aCanvas3648, 1, 14);
                     Class3_Sub26.aClass3_Sub24_Sub2_2563 = new Class3_Sub24_Sub2();
                     Class3_Sub21.aClass155_2491.method2154(-128, Class3_Sub26.aClass3_Sub24_Sub2_2563);
                     Class27.aClass157_524 = new Class157(22050, Class21.anInt443);
                     Class148.anInt1912 = Class75_Sub2.aClass153_2645.method2120(Class1.aClass94_53, (byte)-30);
                     Class3_Sub28_Sub15.anInt3684 = 30;
                     Class96.anInt1354 = 50;
                     Class3_Sub17.aClass94_2464 = Class131.aClass94_1731;
                  } else if(-51 != ~Class96.anInt1354) {
                     if(60 != Class96.anInt1354) {
                        if(~Class96.anInt1354 != -66) {
                           if(Class96.anInt1354 != 70) {
                              if(Class96.anInt1354 == 80) {
                                 var2 = Class3_Sub4.method107(Class140_Sub6.aClass153_2906, (byte)-125);
                                 var3 = Class3_Sub13_Sub9.method208(-119);
                                 if(~var3 < ~var2) {
                                    Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class3_Sub13_Sub38.aClass94_3445, Class72.method1298((byte)9, var2 * 100 / var3), Class24.aClass94_468}, (byte)-66);
                                    Class3_Sub28_Sub15.anInt3684 = 60;
                                 } else {
                                    Class14.method887(21, Class140_Sub6.aClass153_2906);
                                    Class96.anInt1354 = 90;
                                    Class3_Sub28_Sub15.anInt3684 = 60;
                                    Class3_Sub17.aClass94_2464 = Class130.aClass94_1707;
                                 }
                              } else if(Class96.anInt1354 != 90) {
                                 if(-101 == ~Class96.anInt1354) {
                                    if(Class3_Sub13_Sub34.method334(Class140_Sub6.aClass153_2906, 0)) {
                                       Class96.anInt1354 = 110;
                                    }
                                 } else if(-111 != ~Class96.anInt1354) {
                                    if(~Class96.anInt1354 != -121) {
                                       if(~Class96.anInt1354 == -131) {
                                          if(Class140_Sub3.aClass153_2727.method2113((byte)20)) {
                                             if(Class3_Sub1.aClass153_2203.method2113((byte)46)) {
                                                if(Class153.aClass153_1948.method2113((byte)89)) {
                                                   if(Class133.aClass153_1751.method2127((byte)-83, Class95.aClass94_1342)) {
                                                      Class75_Sub4.method1353(Class102.aClass3_Sub28_Sub16_Sub2Array2140, -11931, Class133.aClass153_1751);
                                                      Class3_Sub28_Sub15.anInt3684 = 95;
                                                      Class3_Sub17.aClass94_2464 = Class3_Sub30.aClass94_2597;
                                                      Class96.anInt1354 = 135;
                                                   } else {
                                                      Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class151_Sub1.aClass94_2961, Class72.method1298((byte)9, 90 - -(Class133.aClass153_1751.method2116(22813, Class95.aClass94_1342) / 10)), Class24.aClass94_468}, (byte)-72);
                                                      Class3_Sub28_Sub15.anInt3684 = 85;
                                                   }
                                                } else {
                                                   Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class151_Sub1.aClass94_2961, Class72.method1298((byte)9, 85 - -(Class153.aClass153_1948.method2136((byte)-124) / 20)), Class24.aClass94_468}, (byte)-107);
                                                   Class3_Sub28_Sub15.anInt3684 = 85;
                                                }
                                             } else {
                                                Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class151_Sub1.aClass94_2961, Class72.method1298((byte)9, 75 - -(Class3_Sub1.aClass153_2203.method2136((byte)-128) / 10)), Class24.aClass94_468}, (byte)-120);
                                                Class3_Sub28_Sub15.anInt3684 = 85;
                                             }
                                          } else {
                                             Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class151_Sub1.aClass94_2961, Class72.method1298((byte)9, Class140_Sub3.aClass153_2727.method2136((byte)-123) * 3 / 4), Class24.aClass94_468}, (byte)-81);
                                             Class3_Sub28_Sub15.anInt3684 = 85;
                                          }
                                       } else if(135 == Class96.anInt1354) {
                                          var2 = Class121.method1735(29984);
                                          if(-1 == var2) {
                                             Class3_Sub28_Sub15.anInt3684 = 95;
                                             Class3_Sub17.aClass94_2464 = Class123.aClass94_1653;
                                          } else if(-8 != ~var2 && var2 != 9) {
                                             if(Class30.aBoolean579) {
                                                Class3_Sub17.aClass94_2464 = Class16.aClass94_374;
                                                Class96.anInt1354 = 140;
                                                Class3_Sub28_Sub15.anInt3684 = 96;
                                             } else {
                                                this.gameError("worldlistio_" + var2, -48);
                                                Class117.method1719(1000, 5);
                                             }
                                          } else {
                                             this.gameError("worldlistfull", -48);
                                             Class117.method1719(1000, 5);
                                          }
                                       } else if(~Class96.anInt1354 != -141) {
                                          if(~Class96.anInt1354 == -151) {
                                             Class88.method1454();
                                             if(Class94.aBoolean2146) {
                                                Class3_Sub28_Sub9.anInt3622 = 0;
                                                Class3_Sub28_Sub14.anInt3671 = 0;
                                                Class3_Sub28.anInt2577 = 0;
                                                Class3_Sub20.anInt2488 = 0;
                                             }

                                             Class94.aBoolean2146 = true;
                                             Class119.method1730(Class38.aClass87_665, (byte)14);
                                             Class140.method1862(false, Class3_Sub28.anInt2577, -8914, -1, -1);
                                             Class3_Sub28_Sub15.anInt3684 = 100;
                                             Class96.anInt1354 = 160;
                                             Class3_Sub17.aClass94_2464 = Class3_Sub28.aClass94_2576;
                                          } else if(~Class96.anInt1354 == -161) {
                                             Class3_Sub13_Sub11.method219(true, 3000);
                                          }
                                       } else {
                                          Class3_Sub22.anInt2529 = Class140_Sub3.aClass153_2727.method2120(Class140_Sub4_Sub2.aClass94_3992, (byte)-30);
                                          Class3_Sub13_Sub6.aClass153_3077.method2115(-9, false, true);
                                          Class75_Sub2.aClass153_2645.method2115(111, true, true);
                                          Class140_Sub6.aClass153_2906.method2115(-76, true, true);
                                          Class153.aClass153_1948.method2115(91, true, true);
                                          Class3_Sub13_Sub25.aClass153_3304.method2115(-116, true, true);
                                          Class140_Sub3.aClass153_2727.method2115(99, true, true);
                                          Class3_Sub28_Sub15.anInt3684 = 97;
                                          Class3_Sub17.aClass94_2464 = Class3_Sub5.aClass94_2267;
                                          Class96.anInt1354 = 150;
                                          Class58.aBoolean913 = true;
                                       }
                                    } else if(Class3_Sub13_Sub25.aClass153_3304.method2125(Class3_Sub28_Sub14.aClass94_3672, (byte)116, Class3_Sub28_Sub20.aClass94_3792)) {
                                       Class36 var9 = new Class36(Class3_Sub13_Sub25.aClass153_3304.method2123(0, Class3_Sub28_Sub14.aClass94_3672, Class3_Sub28_Sub20.aClass94_3792));
                                       Class1.method69(var9, 104);
                                       Class3_Sub17.aClass94_2464 = Class117.aClass94_1615;
                                       Class96.anInt1354 = 130;
                                       Class3_Sub28_Sub15.anInt3684 = 80;
                                    } else {
                                       Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class86.aClass94_1183, InputStream_Sub1.aClass94_37}, (byte)-98);
                                       Class3_Sub28_Sub15.anInt3684 = 80;
                                    }
                                 } else {
                                    Class106.aClass67_1443 = new Class67();
                                    Class38.aClass87_665.method1451(0, 10, Class106.aClass67_1443);
                                    Class3_Sub17.aClass94_2464 = Class100.aClass94_1409;
                                    Class3_Sub28_Sub15.anInt3684 = 75;
                                    Class96.anInt1354 = 120;
                                 }
                              } else if(!Class97.aClass153_1376.method2113((byte)58)) {
                                 Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class145.aClass94_1892, Class72.method1298((byte)9, Class97.aClass153_1376.method2136((byte)-125)), Class24.aClass94_468}, (byte)-95);
                                 Class3_Sub28_Sub15.anInt3684 = 70;
                              } else {
                                 Class102 var8 = new Class102(Class3_Sub13_Sub28.aClass153_3352, Class97.aClass153_1376, Class140_Sub6.aClass153_2906, 20, !Class25.aBoolean488);
                                 Class51.method1140(var8);
                                 if(~Class3_Sub28_Sub10.anInt3625 == -2) {
                                    Class51.method1137(0.9F);
                                 }

                                 if(2 == Class3_Sub28_Sub10.anInt3625) {
                                    Class51.method1137(0.8F);
                                 }

                                 if(Class3_Sub28_Sub10.anInt3625 == 3) {
                                    Class51.method1137(0.7F);
                                 }

                                 if(~Class3_Sub28_Sub10.anInt3625 == -5) {
                                    Class51.method1137(0.6F);
                                 }

                                 Class3_Sub17.aClass94_2464 = Class3_Sub13_Sub14.aClass94_3167;
                                 Class96.anInt1354 = 100;
                                 Class3_Sub28_Sub15.anInt3684 = 70;
                              }
                           } else {
                              Class164.aClass153_2052.method2113((byte)34);
                              byte var7 = 0;
                              var2 = var7 + Class164.aClass153_2052.method2136((byte)-124);
                              Class168.aClass153_2097.method2113((byte)120);
                              var2 += Class168.aClass153_2097.method2136((byte)-128);
                              Class140_Sub4_Sub2.aClass153_3993.method2113((byte)70);
                              var2 += Class140_Sub4_Sub2.aClass153_3993.method2136((byte)-123);
                              Class101.aClass153_1428.method2113((byte)32);
                              var2 += Class101.aClass153_1428.method2136((byte)-127);
                              Class100.aClass153_1410.method2113((byte)48);
                              var2 += Class100.aClass153_1410.method2136((byte)-128);
                              Class3_Sub13_Sub36.aClass153_3429.method2113((byte)43);
                              var2 += Class3_Sub13_Sub36.aClass153_3429.method2136((byte)-122);
                              Class70.aClass153_1058.method2113((byte)23);
                              var2 += Class70.aClass153_1058.method2136((byte)-122);
                              Class3_Sub22.aClass153_2528.method2113((byte)94);
                              var2 += Class3_Sub22.aClass153_2528.method2136((byte)-128);
                              Class140_Sub7.aClass153_2939.method2113((byte)91);
                              var2 += Class140_Sub7.aClass153_2939.method2136((byte)-126);
                              Class3_Sub4.aClass153_2258.method2113((byte)102);
                              var2 += Class3_Sub4.aClass153_2258.method2136((byte)-128);
                              Class132.aClass153_1735.method2113((byte)126);
                              var2 += Class132.aClass153_1735.method2136((byte)-124);
                              if(~var2 <= -1101) {
                                 Class132.method1799((byte)96, Class164.aClass153_2052);
                                 Class3_Sub28_Sub15.method631(false, Class164.aClass153_2052);
                                 Class3_Sub28_Sub8.method575(Class164.aClass153_2052, -1);
                                 Class3_Sub16.method375(3, Class159.aClass153_2019, Class164.aClass153_2052);
                                 Class108.method1661(2, Class168.aClass153_2097, Class159.aClass153_2019, true);
                                 Class48.method1103(Class159.aClass153_2019, Class101.aClass153_1428, false);
                                 Class140.method1864(true, (byte)-126, Class100.aClass153_1410, Class157.aClass3_Sub28_Sub17_Sub1_2000, Class159.aClass153_2019);
                                 Class29.method969(Class164.aClass153_2052, 59);
                                 Class3_Sub20.method392(Class3_Sub28_Sub19.aClass153_3772, Class3_Sub13_Sub36.aClass153_3429, -77, Class75_Sub3.aClass153_2660);
                                 Class41.method1053((byte)-117, Class164.aClass153_2052);
                                 Class158.method2180(Class159.aClass153_2019, Class70.aClass153_1058, 11504);
                                 Class107.method1648(Class3_Sub22.aClass153_2528, 255);
                                 Class3_Sub29.method731(Class164.aClass153_2052, (byte)-113);
                                 Class3.method89(true, Class153.aClass153_1948, Class140_Sub6.aClass153_2906, Class140_Sub3.aClass153_2727, Class159.aClass153_2019);
                                 Class3_Sub13_Sub17.method250(2048, Class164.aClass153_2052);
                                 Class46.method1086(Class140_Sub4_Sub2.aClass153_3993, -6);
                                 Class3_Sub13_Sub8.method205(Class3_Sub4.aClass153_2258, 115, Class140_Sub7.aClass153_2939, new Class7());
                                 Class65.method1236(Class3_Sub4.aClass153_2258, Class140_Sub7.aClass153_2939, -117);
                                 Class58.method1197(Class164.aClass153_2052, (byte)69);
                                 Class144.method2065((byte)-125, Class164.aClass153_2052, Class140_Sub6.aClass153_2906);
                                 Class107.method1645(Class164.aClass153_2052, Class140_Sub6.aClass153_2906, (byte)-67);
                                 Class3_Sub28_Sub15.anInt3684 = 50;
                                 Class3_Sub17.aClass94_2464 = Class3_Sub13_Sub12.aClass94_3142;
                                 Class29.method968(128);
                                 Class96.anInt1354 = 80;
                              } else {
                                 Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class3_Sub28_Sub2.aClass94_3546, Class72.method1298((byte)9, var2 / 11), Class24.aClass94_468}, (byte)-80);
                                 Class3_Sub28_Sub15.anInt3684 = 50;
                              }
                           }
                        } else {
                           Class3_Sub28_Sub9.method581(Class153.aClass153_1948, 0, Class140_Sub6.aClass153_2906);
                           Class3_Sub28_Sub15.anInt3684 = 45;
                           Class3_Sub17.aClass94_2464 = Class23.aClass94_459;
                           Class117.method1719(5, 5);
                           Class96.anInt1354 = 70;
                        }
                     } else {
                        var2 = Class3_Sub28_Sub11.method599(-20916, Class140_Sub6.aClass153_2906);
                        var3 = Class55.method1185(6098);
                        if(var3 <= var2) {
                           Class3_Sub17.aClass94_2464 = Class3_Sub28_Sub4.aClass94_3575;
                           Class96.anInt1354 = 65;
                           Class3_Sub28_Sub15.anInt3684 = 40;
                        } else {
                           Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class24.aClass94_461, Class72.method1298((byte)9, 100 * var2 / var3), Class24.aClass94_468}, (byte)-125);
                           Class3_Sub28_Sub15.anInt3684 = 40;
                        }
                     }
                  } else {
                     var2 = Class3_Sub13_Sub12.method228(Class140_Sub6.aClass153_2906, Class153.aClass153_1948, false);
                     var3 = RuntimeException_Sub1.method2286((byte)-5);
                     if(~var2 <= ~var3) {
                        Class3_Sub17.aClass94_2464 = Class143.aClass94_1879;
                        Class3_Sub28_Sub15.anInt3684 = 35;
                        Class96.anInt1354 = 60;
                     } else {
                        Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class3_Sub28_Sub11.aClass94_3643, Class72.method1298((byte)9, 100 * var2 / var3), Class24.aClass94_468}, (byte)-59);
                        Class3_Sub28_Sub15.anInt3684 = 35;
                     }
                  }
               } else {
                  var2 = 0;

                  for(var3 = 0; var3 < 28; ++var3) {
                     var2 += Class3_Sub30.aClass151_Sub1Array2601[var3].method2111(-61) * Class3_Sub13_Sub23.anIntArray3288[var3] / 100;
                  }

                  if(var2 != 100) {
                     if(-1 != ~var2) {
                        Class3_Sub17.aClass94_2464 = Class16.method903(new Class94[]{Class12.aClass94_327, Class72.method1298((byte)9, var2), Class24.aClass94_468}, (byte)-93);
                     }

                     Class3_Sub28_Sub15.anInt3684 = 20;
                  } else {
                     Class3_Sub28_Sub15.anInt3684 = 20;
                     Class3_Sub17.aClass94_2464 = Class44_Sub1.aClass94_2624;
                     Class39.method1039(208, Class140_Sub6.aClass153_2906);
                     Class97.method1593(111, Class140_Sub6.aClass153_2906);
                     Class3_Sub13_Sub13.method233(28280, Class140_Sub6.aClass153_2906);
                     Class96.anInt1354 = 45;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "client.A(" + var1 + ')');
      }
   }

   final void method25(byte var1) {
      try {
         if(-1001 != ~Class143.anInt1875) {
            ++Class44.anInt719;
            if(Class44.anInt719 % 1000 == 1) {
               GregorianCalendar var2 = new GregorianCalendar();
               Class38_Sub1.anInt2618 = var2.get(11) * 600 - (-(var2.get(12) * 10) + -(var2.get(13) / 6));
               Class3_Sub13_Sub7.aRandom3088.setSeed((long)Class38_Sub1.anInt2618);
            }

            this.method48(true);
            if(Class151.aClass8_1936 != null) {
               Class151.aClass8_1936.method838((byte)-70);
            }

            Class3_Sub29.method728(false);
            Class58.method1194(-16385);
            Class32.method996(-43);
            Class62.method1225(18074);
            if(Class138.aBoolean1807) {
               Class31.method990();
            }

            int var4;
            if(Class38.aClass146_668 != null) {
               var4 = Class38.aClass146_668.method2078(-1);
               Class29.anInt561 = var4;
            }

            if(~Class143.anInt1875 != -1) {
               if(~Class143.anInt1875 == -6) {
                  this.method52(107);
                  Class75_Sub4.method1355(true);
               } else if(~Class143.anInt1875 == -26 || ~Class143.anInt1875 == -29) {
                  Class40.method1046(-117);
               }
            } else {
               this.method52(48);
               Class75_Sub4.method1355(true);
            }

            var4 = 121 / ((var1 - 27) / 42);
            if(10 == Class143.anInt1875) {
               this.method47((byte)1);
               Class3_Sub13_Sub21.method267((byte)36);
               Class163_Sub1_Sub1.method2216((byte)81);
               Class127.method1752((byte)-9);
            } else if(Class143.anInt1875 == 30) {
               Class3_Sub13_Sub13.method235(true);
            } else if(Class143.anInt1875 == 40) {
               Class127.method1752((byte)-9);
               if(~Class158.anInt2005 != 2) {
                  if(~Class158.anInt2005 == -16) {
                     Class21.method912(false);
                  } else if(~Class158.anInt2005 != -3) {
                     Class167.method2269((byte)46);
                  }
               }
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "client.N(" + var1 + ')');
      }
   }

}
