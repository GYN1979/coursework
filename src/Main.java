public class Main {
        private static Employee[] employees;
        public static void main(String[] args){
        employees = new Employee[]{
                new Employee("Серков Александр Николаевич", 1, 70000.00),
                new Employee("Остапенко Леонид Михайлович", 2, 75000.00),
                new Employee("Кузнецов Сергей Васильевич", 3, 83000.00),
                new Employee("Мошкин Василий Сергеевич", 4, 66000.00),
                new Employee("Березин Федор Николаевич", 5, 78000.00),
                new Employee("Рыбина Альбина Григорьевна", 5, 69000.00),
                new Employee("Гаврилина Олеся Юрьевна", 4, 72000.00),
                new Employee("Шумилина Ольга Александровна", 3, 81000.00),
                new Employee("Родина Екатерина Игоревна", 2, 57000.00),
                new Employee("Степнова Татьяна Владимировна", 1, 86000.00)};
        System.out.println("Данные по сотрудникам:");
        printEmployees();
        System.out.printf("Затраты на заработную плату сотрудников в месяц составили: %.2f рублей\n",sumSalary());
        System.out.println("Работник с минимальной зарплатой:" + findEmployeeWithMinSalary());
        System.out.println("Работник с максимальной зарплатой:"+ findEmployeeWithMaxSalary());
        System.out.printf("Средняя зарплата сотрудников составляет %.2f рублей\n",averageSalary());
        System.out.println("Список сотрудников:");
        printFulNames();
        }

        public static void printEmployees() {
        for (Employee employee : employees)
        System.out.println(employee.toString());
        }

        public static double sumSalary() {
                double sum = 0;
                for (Employee employee : employees)
                        sum += employee.getSalary();
                return sum;
        }

        public static Employee findEmployeeWithMinSalary() {
                Employee result = employees [0];
                double minSalary = employees[0].getSalary();
                for (Employee employee : employees){
                        if (employee!= null && employee.getSalary () < minSalary){
                                minSalary = employee.getSalary ();
                                result = employee;
                        }
                }
                return result;
        }
        public static Employee findEmployeeWithMaxSalary() {
                Employee result = employees[0];
                double maxSalary = employees[0].getSalary();
                for (Employee employee : employees) {
                        if (employee != null && employee.getSalary() > maxSalary) {
                                maxSalary = employee.getSalary();
                                result = employee;
                        }
                }
                return result;
        }
        public static double averageSalary() {
                int counterNotNull =0;
                for (int i = 0; i < employees.length; i++){
                        if (employees[i] != null) {
                                counterNotNull++;
                        }
                }
                return sumSalary ()/ counterNotNull;
        }
        public static void printFulNames (){
        for (Employee employee : employees){
                System.out.println(employee.getFullName());
        }
        }
        }


