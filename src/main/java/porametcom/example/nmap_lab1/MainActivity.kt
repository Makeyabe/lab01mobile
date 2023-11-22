package porametcom.example.nmap_lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1lyout.ui.theme.Lab1lyoutTheme

data class Person(val name:String,
                  val studentID:String,
                  val imageID:Int)

class MainActivity : ComponentActivity() {
    var persons: List<Person> = listOf<Person>(
        Person("นายปรเมศวร์ สิทธิมงคล","643450078-5",R.drawable.make01),
        Person("นางสาวอมรรัตน์ มาระเหว","643450094-7",R.drawable.amon),
        Person("นางสาวนภัสสร ดวงจันทร์","643450326-2",R.drawable.napatson),
        Person("นางสาวอฆพร ไร่ขาม","643450334-3",R.drawable.akaporn),
        Person("นายกมล จันบุตรดี","643450063-8",R.drawable.aka),
        Person("นางสาววรรณภา เบ้านาค","643450330-1",R.drawable.wanna),
        Person("นางสาวนภาปิลันธ์ ชาวชายโขง","643450327-0",R.drawable.nap),
        Person("นายจักรพรรดิ์ อนุไพร","643450065-4",R.drawable.jak),
        Person("นายเจษฎา ลีรัตน์","643450067-0",R.drawable.jat),
        Person("นางสาวศรสวรรค์ ไพรอนันต์","643450067-0",R.drawable.bobo),
        Person("นางสาวณัฐธิดา บุญพา","643450647-2",R.drawable.jan),
        Person("นายอรัญ ศรีสวัสดิ์","643450095-5",R.drawable.srisawad),
        Person("นายชาญณรงค์ แต่งเมือง","643450069-6",R.drawable.chana),
        Person("นายธนาธิป เตชะ","643450076-9",R.drawable.thana),
        Person("นางสาวพรธิตา ขานพล","643450080-8",R.drawable.beam),
        Person("นายประสิทธิชัย จันทร์สม","643450079-3",R.drawable.prasi),
        Person("นายก้องภพ ตาดี","643450321-2",R.drawable.model),
        Person("นายเทวารัณย์ ชัยกิจ","643450324-6",R.drawable.run),
        Person("นายธนบดี สวัสดี","643450325-4",R.drawable.teammy),

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NMAP_lab1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn{
                        items(persons){
                            data -> Personlist(data)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Personlist(data: Person){
    Row() {
        Image(
            painter = painterResource(id = data.imageID),
            contentDescription = data.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
        )
        Column(modifier = Modifier.padding(4.dp),
            verticalArrangement = Arrangement.Center) {
            Text(data.name)
            Text(data.studentID)
        }
    }
}