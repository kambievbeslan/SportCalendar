package epic.cmd6.sportcalendar.feature_calendar.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Календарь"
    }
    val text: LiveData<String> = _text
}