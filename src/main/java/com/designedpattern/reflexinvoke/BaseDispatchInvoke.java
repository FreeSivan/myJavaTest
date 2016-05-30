package com.designedpattern.reflexinvoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class BaseDispatchInvoke {
	/**
     * 该函数根据成员函数命名规则，依次调用所有符合命名规则的函数
     * @param objects 反射调用函数的参数
     * @param regex 需要调用的函数的命名规则
     * @return boolean：true 调用成功；false 调用失败
     */
	public boolean dispatchInvokeFilterByName(Object[] objects, String regex) {
        Pattern pattern = Pattern.compile(regex);
        for (Method item : this.getClass().getDeclaredMethods()) {
            if (!pattern.matcher(item.getName()).matches()) {
                continue;
            }
            try {
                item.invoke(this, objects);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 通过AutoInvoke注解对成员函数进行调用，并通过id属性进行排序
     * 根据AutoInvoke注解id的大小，从小到大依次调用
     * @param objects 反射调用函数的参数
     * @return boolean：true 调用成功；false 调用失败
     */
    public boolean dispatchInvokeOrderByAnn(Object[] objects) {
        Map<Integer, Method> methodMap = new HashMap<Integer, Method>();
        for (Method item : this.getClass().getDeclaredMethods()) {
            AutoInvoke autoInvoke = item.getAnnotation(AutoInvoke.class);
            if (autoInvoke != null) {
            	methodMap.put(autoInvoke.id(), item);;
            }
        }
        for (Integer val : methodMap.keySet()) {
            Method tmp = methodMap.get(val);
            try {
                tmp.invoke(this, objects);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 通过AutoInvoke注解对成员函数进行调用，通过style属性过滤，通过id属性排序
     * 只调用style属性值为ann的函数，按照id值从小到大依次调用
     * @param objects 反射调用函数的参数
     * @param ann 函数调用的过滤条件，只调用style值为ann的成员函数
     * @return boolean：true 调用成功；false 调用失败
     */
    public boolean dispatchInvokeFilterOrderByAnn(Object[] objects, String ann) {
    	Map<Integer, Method> methodMap = new HashMap<Integer, Method>();
    	for (Method item : this.getClass().getDeclaredMethods()) {
    		AutoInvoke autoInvoke = item.getAnnotation(AutoInvoke.class);
    		if (autoInvoke != null && ann.equals(autoInvoke.style())) {
    			methodMap.put(autoInvoke.id(), item);
    		}
    	}
    	for (Integer val : methodMap.keySet()) {
    		Method tmp = methodMap.get(val);
    		try {
				tmp.invoke(this, objects);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
    	}
        return true;
    }
}
