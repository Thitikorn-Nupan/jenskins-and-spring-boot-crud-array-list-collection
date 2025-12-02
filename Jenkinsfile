// start with pipeline { ... }
pipeline { // set up agent and stages inside pipeline

    /*
    agent เป็นคำสั่งที่เอาไว้บอก Jenkins ว่าจะให้ใช้ executor ตัวใดมา run คำสั่งใน stages ทั้งหมดนี้ ที่ใช้บ่อย ๆ จะเป็น
    none คือ ไม่ใช้ executor ใด ๆ สำหรับ stages ทั้งหมด (ต้องไปกำหนด executor แยกสำหรับแต่ stage เอง)
    any คือ ใช้ executor ใด ๆ ก็ได้
    docker คือ ใช้ docker executor มา run stages ทั้งหมดนี้
    */
    agent any

    // declare env as var for using on stages { ... }
    environment {
            DOMAIN_URI = 'thitikorn-nupan.com'
            PATH_APP_ECOMMERCE = 'http://www.thitikorn-nupan.com/app/ecommerce/'
            PATH_APP_REVIEWS_BOOK = 'http://www.thitikorn-nupan.com/app/reviews-book/'
            // you have to call tru env.<var name>
    }

    // stages as working Flows tell Pipeline what gonna do
    stages { //

        // step 1
        stage('Before Init Read Environment') {
            steps {
                echo 'Before Init Read Environment'
                echo '******************************'
                // Note call env you have to use " " not ' '
                echo "DOMAIN_URI : ${env.DOMAIN_URI}"
                echo "PATH_APP_ECOMMERCE : ${env.PATH_APP_ECOMMERCE}"
                echo "PATH_APP_REVIEWS_BOOK : ${env.PATH_APP_REVIEWS_BOOK}"
            }

        }

        // step 2
        stage('Before Init Write Groovy') {
            steps {
                /*
                    เราสามารถเขียน Pipeline Logic ที่ซับซ้อนด้วยภาษา Groovy ได้ โดยการใช้ script block
                    โดยการ กำหนด script { ... } ไว้ใน steps { ... }
                */
                script {
                      def numbers = [10, 20, 30, 40, 50];
                      def sum = 0;
                      for(int index = 0; index < numbers.size(); index++) {
                         println("value of item : " + numbers[index] );
                         sum += numbers[index]
                      }
                      println("sum of item : " + sum );
                }
            }

        }

        // step 2
        stage('Before Init Check All Software') {
            steps {
                  // Note , you do on local that meaning all software you version you have installed !!
                  // sh เป็นคำสั่งที่ใช้ในการ run Linux Command เช่น
                  sh 'java -version'
                  sh 'mvn -version'
                  sh 'git --version'
                  sh 'node --version'
                  sh 'nvm --version'
            }

        }


        // step 3
        stage('Init') {
            steps {
                echo 'Init'
                echo '******************************'
            }
        }

        // step 4
        stage('Maven Install') {
            steps {
                echo 'Maven Install'
                echo '******************************'
            }
        }

        // step 5
        stage('Deploy') {
            steps{
                echo 'Deploy'
                echo '******************************'
            }
        }
    }
}