package com.designedpattern.reflexinvoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class BaseDispatchInvoke {
	/**
     * �ú������ݳ�Ա���������������ε������з�����������ĺ���
     * @param objects ������ú����Ĳ���
     * @param regex ��Ҫ���õĺ�������������
     * @return boolean��true ���óɹ���false ����ʧ��
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
     * ͨ��AutoInvokeע��Գ�Ա�������е��ã���ͨ��id���Խ�������
     * ����AutoInvokeע��id�Ĵ�С����С�������ε���
     * @param objects ������ú����Ĳ���
     * @return boolean��true ���óɹ���false ����ʧ��
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
     * ͨ��AutoInvokeע��Գ�Ա�������е��ã�ͨ��style���Թ��ˣ�ͨ��id��������
     * ֻ����style����ֵΪann�ĺ���������idֵ��С�������ε���
     * @param objects ������ú����Ĳ���
     * @param ann �������õĹ���������ֻ����styleֵΪann�ĳ�Ա����
     * @return boolean��true ���óɹ���false ����ʧ��
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
