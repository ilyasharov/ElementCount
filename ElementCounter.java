import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class ElementCounter {
    
    /**
     * Подсчитывает, сколько раз каждый элемент встречается в массиве
     * 
     * @param <T> тип элементов массива
     * @param array исходный массив
     * @return Map, где ключ - элемент, значение - количество его вхождений
     */
    public static <T> Map<T, Integer> countElements(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        
        Map<T, Integer> result = new HashMap<>();
        
        for (T element : array) {
            // Если элемент уже есть в Map, увеличиваем счётчик, иначе добавляем с 1
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        
        return result;
    }
    
    /**
     * Перегрузка для работы с List
     */
    public static <T> Map<T, Integer> countElements(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Список не может быть null");
        }
        
        Map<T, Integer> result = new HashMap<>();
        
        for (T element : list) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        
        return result;
    }
}