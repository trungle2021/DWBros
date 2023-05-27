package entities1545;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_times", schema = "dwbros", catalog = "")
public class MealTimes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "meal_time_id", nullable = false, length = 36)
    private String mealTimeId;
    @Basic
    @Column(name = "times", nullable = true, length = 50)
    private String times;

    public String getMealTimeId() {
        return mealTimeId;
    }

    public void setMealTimeId(String mealTimeId) {
        this.mealTimeId = mealTimeId;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MealTimes mealTimes = (MealTimes) o;

        if (mealTimeId != null ? !mealTimeId.equals(mealTimes.mealTimeId) : mealTimes.mealTimeId != null) return false;
        if (times != null ? !times.equals(mealTimes.times) : mealTimes.times != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mealTimeId != null ? mealTimeId.hashCode() : 0;
        result = 31 * result + (times != null ? times.hashCode() : 0);
        return result;
    }
}
