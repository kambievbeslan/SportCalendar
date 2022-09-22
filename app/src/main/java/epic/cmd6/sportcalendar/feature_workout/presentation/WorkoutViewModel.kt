package epic.cmd6.sportcalendar.feature_workout.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkoutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Тренировка"
    }
    val text: LiveData<String> = _text
}