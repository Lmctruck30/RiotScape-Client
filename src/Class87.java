import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public class Class87 implements Runnable {

	public static String javaVersion;
	public Class122[] mainFileCacheIdxArray;
	public Class122 mainFileCache2File = null;
	public EventQueue anEventQueue1199;
	private Thread aThread1200;
	private boolean aBoolean1201 = false;
	public static String operatingSystemNameLowerCase;
	private Class64 aClass64_1203 = null;
	public Class122 mainFileCacheIdx255File = null;
	public static String operatingSystemName;
	private Sensor aSensor1206;
	public Class122 randomDataFile = null;
	private Display aDisplay1208;
	private static String userHomeDirectory;
	public static String operatingSystemVersion;
	private static Hashtable<String, File> loadedFiles = new Hashtable<String, File>(16);
	private String aString1212;
	private Class64 aClass64_1213 = null;
	public static int anInt1214 = 1;
	private int fileStoreId;
	public static String javaVendorName;
	private Interface1 anInterface1_1217;
	public static String javaVitualMachineArchitecture;
	public Applet gameApplet = null;
	public static Method aMethod1220;
	static volatile long aLong1221 = 0L;
	public static Method aMethod1222;


	public final void method1431(int var1) {
		if(var1 != 0) {
			this.method1442((Class)null, 99);
		}

		aLong1221 = Class5.method830((byte)-55) - -5000L;
	}

	public final boolean method1432(boolean var1) {
		if(var1) {
			this.mainFileCacheIdxArray = null;
		}

		return this.aDisplay1208 != null;
	}

	public final Class64 method1433(String var1, int var2) {
		if(var2 != 12) {
			this.randomDataFile = null;
		}

		return this.method1435(12, 0, var1, 0, var2 + -58);
	}

	public final Class64 method1434(int[] var1, int var2, int var3, Component var4, Point var5, int var6) {
		return var2 != 10000?null:this.method1435(17, var6, new Object[]{var4, var1, var5}, var3, -57);
	}

	private final Class64 method1435(int var1, int var2, Object var3, int var4, int var5) {
		Class64 var6 = new Class64();
		var6.anInt980 = var2;
		var6.anInt979 = var4;
		var6.anInt975 = var1;
		var6.anObject977 = var3;
		synchronized(this) {
			if(var5 >= -2) {
				return null;
			} else {
				if(this.aClass64_1203 != null) {
					this.aClass64_1203.aClass64_976 = var6;
					this.aClass64_1203 = var6;
				} else {
					this.aClass64_1203 = this.aClass64_1213 = var6;
				}

				this.notify();
				return var6;
			}
		}
	}

	public final Class64 method1436(Frame var1, int var2) {
		if(var2 <= 78) {
			this.gameApplet = null;
		}

		return this.method1435(7, 0, var1, 0, -112);
	}

	public final Class64 method1437(int var1, int var2, Component var3, int var4) {
		if(var1 != 14) {
			return null;
		} else {
			Point var5 = var3.getLocationOnScreen();
			return this.method1435(14, var4 - -var5.y, (Object)null, var5.x + var2, var1 + -105);
		}
	}

	private static final Class122 getPrefenceLocation(boolean var0, String fileName) {
		if(var0) {
			getPrefenceLocation(true, (String)null);
		}

		String[] cacheLocation = new String[]{ userHomeDirectory,  "/tmp/", ""};

		for(int index = 0; cacheLocation.length > index; ++index) {
			String currentLocation = cacheLocation[index];
			if(currentLocation.length() <= 0 || (new File(currentLocation)).exists()) {
				try {
					Class122 preferences = new Class122(new File(currentLocation, "riotscape_" + fileName + "_preferences.dat"), "rw", 10000L);
					return preferences;
				} catch (Exception var6) {
					;
				}
			}
		}

		return null;
	}

	public final Class64 method1439(boolean flag, URL urlAddress) {
		if(flag) {
			this.mainFileCacheIdx255File = null;
		}

		return this.method1435(4, 0, urlAddress, 0, -118);
	}

	public final Class64 method1440(boolean var1, int var2, Component var3) {
		int var4 = 34 % ((-10 - var2) / 52);
		return this.method1435(15, 0, var3, var1?1:0, -84);
	}

	public final Class64 method1441(byte var1, String var2, int var3) {
		return var1 != 8?null:this.method1435(1, 0, var2, var3, -17);
	}

	public final Class64 method1442(Class var1, int var2) {
		return var2 != 0?null:this.method1435(11, 0, var1, 0, -5);
	}

	public final Class64 method1443(Class var1, Class[] var2, int var3, String var4) {
		if(var3 > -7) {
			userHomeDirectory = null;
		}

		return this.method1435(8, 0, new Object[]{var1, var4, var2}, 0, -75);
	}

	public final void run() {
		while(true) {
			Class64 var1;
			synchronized(this) {
				while(true) {
					if(this.aBoolean1201) {
						return;
					}

					if(this.aClass64_1213 != null) {
						var1 = this.aClass64_1213;
						this.aClass64_1213 = this.aClass64_1213.aClass64_976;
						if(this.aClass64_1213 == null) {
							this.aClass64_1203 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
						;
					}
				}
			}

			try {
				int var2 = var1.anInt975;
				if(var2 == 1) {
					if(~aLong1221 < ~Class5.method830((byte)-55)) {
						throw new IOException();
					}

					var1.anObject974 = new Socket(InetAddress.getByName((String)var1.anObject977), var1.anInt979);
				} else if(2 != var2) {
					if(-5 != ~var2) {
						Object[] var3;
						if(-9 != ~var2) {
							if(-10 != ~var2) {
								String var4;
								if(~var2 == -4) {
									if(~Class5.method830((byte)-55) > ~aLong1221) {
										throw new IOException();
									}

									var4 = (var1.anInt979 >> 24 & 255) + "." + (var1.anInt979 >> 16 & 255) + "." + (var1.anInt979 >> -168961752 & 255) + "." + (255 & var1.anInt979);
									var1.anObject974 = InetAddress.getByName(var4).getHostName();
								} else if(~var2 != -6) {
									if(~var2 == -7) {
										Frame var5 = new Frame("Jagex Full Screen");
										var1.anObject974 = var5;
										var5.setResizable(false);
										this.aDisplay1208.method918(-56, var1.anInt980 & '\uffff', var1.anInt980 >> -246436720, '\uffff' & var1.anInt979, var5, var1.anInt979 >>> -106794832);
									} else if(-8 != ~var2) {
										if(10 == var2) {
											Class[] var17 = new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")};
											Runtime runtime = Runtime.getRuntime();
											Method method;
											if(!operatingSystemNameLowerCase.startsWith("mac")) {
												method = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var17);
												method.setAccessible(true);
												method.invoke(runtime, new Object[]{var1.anObject977, "jawt"});
												method.setAccessible(false);
											}

											method = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var17);
											System.out.println("Class: "+method.getName()+" - "+method.getClass().getName());
											method.setAccessible(true);
											if(!operatingSystemNameLowerCase.startsWith("linux") && !operatingSystemNameLowerCase.startsWith("sunos")) {
												if(operatingSystemNameLowerCase.startsWith("mac")) {
													method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "libjogl.jnilib").toString()});
													method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "libjogl_awt.jnilib").toString()});
												} else {
													if(!operatingSystemNameLowerCase.startsWith("win")) {
														throw new Exception();
													}

													method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "jogl.dll").toString()});
													method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "jogl_awt.dll").toString()});
												}
											} else {
												method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "libgluegen-rt.so").toString()});
												Class var8 = ((Class)var1.anObject977).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
												var8.getMethod("begin", new Class[0]).invoke((Object)null, new Object[0]);
												method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "libjogl.so").toString()});
												var8.getMethod("end", new Class[0]).invoke((Object)null, new Object[0]);
												method.invoke(runtime, new Object[]{var1.anObject977, getCacheLocation(this.aString1212, this.fileStoreId, true, "libjogl_awt.so").toString()});
											}

											method.setAccessible(false);
										} else {
											int var18;
											if(-12 == ~var2) {
												Field var20 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
												var20.setAccessible(true);
												Vector var24 = (Vector)var20.get(((Class)var1.anObject977).getClassLoader());

												for(var18 = 0; ~var24.size() < ~var18; ++var18) {
													Object var26 = var24.elementAt(var18);
													Method var9 = var26.getClass().getDeclaredMethod("finalize", new Class[0]);
													var9.setAccessible(true);
													var9.invoke(var26, new Object[0]);
													var9.setAccessible(false);
													Field var10 = var26.getClass().getDeclaredField("handle");
													var10.setAccessible(true);
													var10.set(var26, new Integer(0));
													var10.setAccessible(false);
												}

												var20.setAccessible(false);
											} else if(-13 == ~var2) {
												var4 = (String)var1.anObject977;
												Class122 var19 = getPrefenceLocation(false, var4);
												var1.anObject974 = var19;
											} else if(~var2 == -15) {
												int y = var1.anInt980;
												int x = var1.anInt979;
												this.aSensor1206.forceMouseMove(x, y);
											} else if(15 == var2) {
												boolean var21 = var1.anInt979 != 0;
												Component var27 = (Component)var1.anObject977;
												this.aSensor1206.method1797(var27, 1, var21);
											} else if(17 != var2) {
												if(16 != var2) {
													throw new Exception();
												}

												try {
													if(!operatingSystemNameLowerCase.startsWith("win")) {
														throw new Exception();
													}

													var4 = (String)var1.anObject977;
													if(!var4.startsWith("http://") && !var4.startsWith("https://")) {
														throw new Exception();
													}

													String var25 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

													for(var18 = 0; var18 < var4.length(); ++var18) {
														if(~var25.indexOf(var4.charAt(var18)) == 0) {
															throw new Exception();
														}
													}

													Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var4 + "\"");
													var1.anObject974 = null;
												} catch (Exception var12) {
													var1.anObject974 = var12;
												}
											} else {
												var3 = (Object[])var1.anObject977;
												this.aSensor1206.setCustomCursor((byte)113, (Point)var3[2], var1.anInt979, (Component)var3[0], var1.anInt980, (int[])var3[1]);
											}
										}
									} else {
										this.aDisplay1208.method920(-117);
									}
								} else {
									var1.anObject974 = this.aDisplay1208.method919(true);
								}
							} else {
								var3 = (Object[])var1.anObject977;
								if(((Class)var3[0]).getClassLoader() == null) {
									throw new SecurityException();
								}

								var1.anObject974 = ((Class)var3[0]).getDeclaredField((String)var3[1]);
							}
						} else {
							var3 = (Object[])var1.anObject977;
							if(((Class)var3[0]).getClassLoader() == null) {
								throw new SecurityException();
							}

							var1.anObject974 = ((Class)var3[0]).getDeclaredMethod((String)var3[1], (Class[])var3[2]);
						}
					} else {
						if(~aLong1221 < ~Class5.method830((byte)-55)) {
							throw new IOException();
						}

						var1.anObject974 = new DataInputStream(((URL)var1.anObject977).openStream());
					}
				} else {
					Thread var16 = new Thread((Runnable)var1.anObject977);
					var16.setDaemon(true);
					var16.start();
					var16.setPriority(var1.anInt979);
					var1.anObject974 = var16;
				}

				var1.anInt978 = 1;
			} catch (ThreadDeath var13) {
				throw var13;
			} catch (Throwable var14) {
				var1.anInt978 = 2;
			}
		}
	}

	public final Class64 method1444(int var1, Class var2) {
		if(var1 > -13) {
			this.method1435(88, -20, (Object)null, 76, -127);
		}

		return this.method1435(10, 0, var2, 0, -113);
	}

	public final void method1445(int var1) {
		synchronized(this) {
			this.aBoolean1201 = true;
			this.notifyAll();
		}

		try {
			this.aThread1200.join();
		} catch (InterruptedException var8) {
			;
		}

		if(var1 != 0) {
			getPrefenceLocation(false, (String)null);
		}

		if(this.mainFileCache2File != null) {
			try {
				this.mainFileCache2File.method1740(var1 ^ 1);
			} catch (IOException var7) {
				;
			}
		}

		if(this.mainFileCacheIdx255File != null) {
			try {
				this.mainFileCacheIdx255File.method1740(1);
			} catch (IOException var6) {
				;
			}
		}

		if(this.mainFileCacheIdxArray != null) {
			for(int var2 = 0; ~this.mainFileCacheIdxArray.length < ~var2; ++var2) {
				if(this.mainFileCacheIdxArray[var2] != null) {
					try {
						this.mainFileCacheIdxArray[var2].method1740(var1 ^ 1);
					} catch (IOException var5) {
						;
					}
				}
			}
		}

		if(this.randomDataFile != null) {
			try {
				this.randomDataFile.method1740(var1 + 1);
			} catch (IOException var4) {
				;
			}
		}

	}

	public final Interface1 method1446(byte var1) {
		if(var1 < 71) {
			this.method1452((String)null, true);
		}

		return this.anInterface1_1217;
	}

	public final Class64 method1447(int var1, String var2, Class var3) {
		if(var1 > -39) {
			this.method1452((String)null, true);
		}

		return this.method1435(9, 0, new Object[]{var3, var2}, 0, -43);
	}

	public static final File getCacheLocation(String subDirectoryFolderName, int fileStore, boolean flag, String fileName) {
		System.out.println("Folder: "+subDirectoryFolderName+fileName+" fileStore: "+fileStore+" fileName "+fileName+" flag: "+flag);
		File preLoadedFile = (File)loadedFiles.get(fileName);
		if(preLoadedFile != null) {
			System.out.println("preloaded");
			return preLoadedFile;
		} else {
			if(!flag) {
				getPrefenceLocation(true, (String)null);
			}

			String[] baseDirectory = new String[]{userHomeDirectory, "/tmp/", ""};
			String[] folderName = new String[]{"Riotscape" + fileStore, "Riotscape_file_store_" + fileStore};

			for(int attempts = 0; ~attempts > -3; ++attempts) {
				for(int folderNameIndex = 0; folderName.length > folderNameIndex; ++folderNameIndex) {
					for(int baseDirectoryIndex = 0; baseDirectory.length > baseDirectoryIndex; ++baseDirectoryIndex) {
						String fullFileLocation = baseDirectory[baseDirectoryIndex] + folderName[folderNameIndex] + "/" + (subDirectoryFolderName != null?subDirectoryFolderName + "/":"") + fileName;
						RandomAccessFile randomAccessFile = null;

						try {
							File newFile = new File(fullFileLocation);
							if(attempts != 0 || newFile.exists()) {
								String baseDirectoryString = baseDirectory[baseDirectoryIndex];
								if(attempts != 1 || ~baseDirectoryString.length() >= -1 || (new File(baseDirectoryString)).exists()) {
									(new File(baseDirectory[baseDirectoryIndex] + folderName[folderNameIndex])).mkdir();
									if(subDirectoryFolderName != null) {
										(new File(baseDirectory[baseDirectoryIndex] + folderName[folderNameIndex] + "/" + subDirectoryFolderName)).mkdir();
									}

									randomAccessFile = new RandomAccessFile(newFile, "rw");
									int checkForData = randomAccessFile.read();
									randomAccessFile.seek(0L);
									randomAccessFile.write(checkForData);
									randomAccessFile.seek(0L);
									randomAccessFile.close();
									loadedFiles.put(fileName, newFile);
									return newFile;
								}
							}
						} catch (Exception loadingIdxError) {
							try {
								if(randomAccessFile != null) {
									randomAccessFile.close();
									randomAccessFile = null;
								}
							} catch (Exception var15) {
								;
							}
						}
					}
				}
			}

			throw new RuntimeException();
		}
	}

	public final Class64 method1449(int var1, int var2) {
		if(var1 != 3) {
			this.mainFileCacheIdx255File = null;
		}

		return this.method1435(3, 0, (Object)null, var2, var1 + -96);
	}

	public final Class64 method1450(int var1, int var2, int var3, int var4, int var5) {
		int var6 = -68 % ((var5 - 4) / 53);
		return this.method1435(6, var1 + (var2 << 553962480), (Object)null, (var4 << 220768560) + var3, -49);
	}

	public final Class64 method1451(int var1, int var2, Runnable var3) {
		return var1 != 0?null:this.method1435(2, 0, var3, var2, -27);
	}

	public final Class64 method1452(String var1, boolean var2) {
		if(!var2) {
			this.method1436((Frame)null, 101);
		}

		return this.method1435(16, 0, var1, 0, -10);
	}

	public final Class64 method1453(byte var1) {
		if(var1 < 7) {
			this.method1443((Class)null, (Class[])null, -91, (String)null);
		}

		return this.method1435(5, 0, (Object)null, 0, -127);
	}

	public Class87(Applet applet, int fileStore, String var3, int idxArrayLength) throws Exception {
		javaVersion = "1.1";
		this.aString1212 = var3;
		this.fileStoreId = fileStore;
		this.gameApplet = applet;
		javaVendorName = "Unknown";

		try {
			javaVendorName = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var17) {
			;
		}

		try {
			operatingSystemName = System.getProperty("os.name");
		} catch (Exception var16) {
			operatingSystemName = "Unknown";
		}

		operatingSystemNameLowerCase = operatingSystemName.toLowerCase();

		try {
			javaVitualMachineArchitecture = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var15) {
			javaVitualMachineArchitecture = "";
		}

		try {
			operatingSystemVersion = System.getProperty("os.version").toLowerCase();
		} catch (Exception var14) {
			operatingSystemVersion = "";
		}

		try {
			userHomeDirectory = System.getProperty("user.home");
			if(userHomeDirectory != null) {
				userHomeDirectory = userHomeDirectory + "/";
			}
		} catch (Exception var13) {
			;
		}

		if(userHomeDirectory == null) {
			userHomeDirectory = "~/";
		}

		try {
			this.anEventQueue1199 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var12) {
			;
		}

		try {
			if(applet != null) {
				aMethod1222 = applet.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
			} else {
				aMethod1222 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE});
			}
		} catch (Exception var11) {
			;
		}

		try {
			if(applet == null) {
				aMethod1220 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
			} else {
				aMethod1220 = applet.getClass().getMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
			}
		} catch (Exception var10) {
			;
		}

		this.randomDataFile = new Class122(getCacheLocation((String)null, this.fileStoreId, true, "random.dat"), "rw", 25L);
		this.mainFileCache2File = new Class122(getCacheLocation(this.aString1212, this.fileStoreId, true, "main_file_cache.dat2"), "rw", 104857600L);
		this.mainFileCacheIdx255File = new Class122(getCacheLocation(this.aString1212, this.fileStoreId, true, "main_file_cache.idx255"), "rw", 1048576L);
		this.mainFileCacheIdxArray = new Class122[idxArrayLength];

		for(int index = 0; ~idxArrayLength < ~index; ++index) {
			this.mainFileCacheIdxArray[index] = new Class122(getCacheLocation(this.aString1212, this.fileStoreId, true, "main_file_cache.idx" + index), "rw", 1048576L);
		}

		try {
			this.aDisplay1208 = new Display();
		} catch (Throwable var9) {
			;
		}

		try {
			this.aSensor1206 = new Sensor();
		} catch (Throwable var8) {
			;
		}

		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

		for(ThreadGroup currentThread = threadGroup.getParent(); currentThread != null; currentThread = currentThread.getParent()) {
			threadGroup = currentThread;
		}

		Thread[] thread = new Thread[1000];
		threadGroup.enumerate(thread);

		for(int index = 0; index < thread.length; ++index) {
			if(thread[index] != null && thread[index].getName().startsWith("AWT")) {
				thread[index].setPriority(1);
			}
		}

		this.aBoolean1201 = false;
		this.aThread1200 = new Thread(this);
		this.aThread1200.setPriority(10);
		this.aThread1200.setDaemon(true);
		this.aThread1200.start();
	}
}
