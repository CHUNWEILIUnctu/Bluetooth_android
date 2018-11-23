public class MainActivity extends AppCompatActivity {
    private final String DEVICE_ADDRESS = "20:15:11:23:93:85"; //MAC Address of Bluetooth Module
    private final UUID PORT_UUID = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    private BluetoothDevice device;
    private BluetoothSocket socket;
    private OutputStream outputStream;
    
    private Button btnBluetoothConnect;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bluetooth_connect_btn = (Button) findViewById(R.id.btnBluetoothConnect);
        
        //Button that connects the device to the bluetooth module when pressed
        bluetooth_connect_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(BTinit())
                {
                    BTconnect();
                }

            }
        });
    }
