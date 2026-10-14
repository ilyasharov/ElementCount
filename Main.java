public class Main {
    public static void main(String[] args) {
        // Пример 1: Массив строк
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> fruitCount = ElementCounter.countElements(fruits);
        System.out.println(fruitCount);
        
        // Пример 2: Массив чисел
        Integer[] numbers = {1, 2, 3, 2, 1, 1, 4, 5, 4, 1};
        Map<Integer, Integer> numberCount = ElementCounter.countElements(numbers);
        System.out.println(numberCount);
        
        // Пример 3: Работа со списком
        List<String> words = Arrays.asList("java", "python", "java", "c++", "python", "java");
        Map<String, Integer> wordCount = ElementCounter.countElements(words);
        System.out.println(wordCount);
        
        // Пример 4: Массив символов (Character)
        Character[] chars = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> charCount = ElementCounter.countElements(chars);
        System.out.println(charCount);
        
        // Пример 5: Подсчёт и вывод в отсортированном виде
        String[] letters = {"b", "a", "c", "b", "a", "b"};
        Map<String, Integer> letterCount = ElementCounter.countElements(letters);
        letterCount.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
