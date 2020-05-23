package com.hsy.parrot.bean.response;

/**
 * ��װ���
 * ��������
 * ClassName: ResponseUtils    
 * date: 2018��1��26�� ����4:03:45 
 * @author hsy
 * @since JDK 1.8
 */
public class ResponseUtils {

    /**
     * ����ɹ����޲���
     * @author 82702
     * @return
     * @since JDK 1.8
     */
    public static <T> ResponseEntity packegeResult() {
        return new ResponseEntity(GeneConstant.SUCCESS);
    }

    /**
     * ����ɹ����в���
     * @author 82702
     * @param c
     * @return
     * @since JDK 1.8
     */
    public static <T> ResponseEntity packegeResult(T c) {
        return new ResponseEntity(GeneConstant.SUCCESS).setValue(c);
    }

    /**
     * ����ɹ������message��������messageΪ��error��ʱ������ʧ�ܣ�����ֵ��Ϊ�ɹ���
     * �в���
     * @author 82702
     * @param c
     * @param message
     * @return
     * @since JDK 1.8
     */
    public static <T> ResponseEntity packegeResult(T c, String message) {
        return new ResponseEntity(message).setValue(c);
    }

    /**
     * ����ɹ������message��������messageΪ��error��ʱ������ʧ�ܣ�����ֵ��Ϊ�ɹ���
     * @author 82702
     * @param message
     * @return
     * @since JDK 1.8
     */
    public static <T> ResponseEntity packegeResult(String message) {
        return new ResponseEntity(message);
    }

    /**
     * ����ɹ����
     * @author whz
     * @param result
     * @param message
     * @return
     * @since JDK 1.8
     */
    public static ResponseEntity packegeResult(int result, String message) {
        return new ResponseEntity(result, message);
    }

    /**
     * ����ɹ����
     * @author whz
     * @param result
     * @return
     * @since JDK 1.8
     */
    public static ResponseEntity packegeResult(int result) {
        return new ResponseEntity(result);
    }

    /**
     * ����ɹ����
     * @author whz
     * @param result
     * @param message
     * @return
     * @since JDK 1.8
     */
    public static <T> ResponseEntity packegeResult(int result, String message, T t) {
        return new ResponseEntity(result, message, t);
    }

}
