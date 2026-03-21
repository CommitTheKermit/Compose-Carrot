import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composecarrot.ui.taglist.RefreshButton
import com.example.composecarrot.ui.taglist.SingleTagComboBox

@Composable
fun TagList(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.horizontalScroll(scrollState),

    ) {
        RefreshButton()
        SingleTagComboBox(content = "가락2동 외 59")
        SingleTagComboBox(content = "가격")
        SingleTagComboBox(content = "카테고리")
        SingleTagComboBox(content = "정확도순")
    }
}
