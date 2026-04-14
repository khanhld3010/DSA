package MyList;

import java.util.Map;

public class TreeMap {
    static void main(String[] args) {
        String cauVan = "Học Java rất vui và học lập trình Java rất thú vị";
        System.out.println("Câu gốc: " + cauVan + "\n");
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap();
        String[] strings = cauVan.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String tuHienTai = strings[i].toLowerCase();
            if (treeMap.containsKey(tuHienTai)) {
                treeMap.put(tuHienTai, treeMap.get(tuHienTai) + 1);
            } else {
                treeMap.put(tuHienTai,1);
            }
        }
        System.out.println("Kết quả đếm từ (đã được sắp xếp theo bảng chữ cái):");

        // Cú pháp đặc biệt để duyệt qua từng cặp Key-Value trong Map
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Từ '" + entry.getKey() + "' xuất hiện: " + entry.getValue() + " lần");
        }
    }
}
