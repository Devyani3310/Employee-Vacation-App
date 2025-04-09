@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployee());
            employees.add(new SalariedEmployee());
            employees.add(new Manager());
        }
    }

    @GetMapping
    public List<Float> getVacationDays() {
        return employees.stream()
                        .map(Employee::getVacationDays)
                        .collect(Collectors.toList());
    }

    @PostMapping("/work/{index}")
    public void work(@PathVariable int index, @RequestParam int days) {
        employees.get(index).work(days);
    }

    @PostMapping("/vacation/{index}")
    public void takeVacation(@PathVariable int index, @RequestParam float days) {
        employees.get(index).takeVacation(days);
    }
}
